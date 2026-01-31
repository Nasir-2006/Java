import subprocess
import re

def get_wifi_passwords():
    # 1. Get the list of all saved Wi-Fi profiles
    # We use 'netsh wlan show profiles' command
    command_output = subprocess.run(["netsh", "wlan", "show", "profiles"], capture_output=True).stdout.decode()
    
    # 2. Extract profile names using Regex
    # Looks for the pattern "All User Profile     : [Name]"
    profile_names = (re.findall("All User Profile\s*:\s(.*)", command_output))
    
    wifi_list = []

    # 3. Loop through each profile to get the password
    if len(profile_names) != 0:
        for name in profile_names:
            # The profile name usually comes with a \r at the end, so we strip it
            name = name.strip()
            
            profile_info = {}
            profile_info["SSID"] = name
            
            # Run the command to show details for this specific profile
            # key=clear is what reveals the password
            profile_info_pass = subprocess.run(["netsh", "wlan", "show", "profile", name, "key=clear"], capture_output=True).stdout.decode()
            
            # Search for the "Key Content" line
            password = re.search("Key Content\s*:\s(.*)", profile_info_pass)
            
            if password == None:
                profile_info["Password"] = None
            else:
                profile_info["Password"] = password.group(1).strip()
            
            wifi_list.append(profile_info)

    return wifi_list

# Main Execution
if __name__ == "__main__":
    print("Extracting Wi-Fi Passwords...\n")
    results = get_wifi_passwords()
    
    for x in results:
        print(f"Wi-Fi Name: {x['SSID']}")
        print(f"Password:   {x['Password']}")
        print("-" * 30)