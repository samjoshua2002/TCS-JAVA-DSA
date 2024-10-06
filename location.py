import instaloader
loader = instaloader.Instaloader()
USERNAME = 'shivani__11220'
try:
    profile = instaloader.Profile.from_username(loader.context, USERNAME)
    print(f"Username: {profile.username}")
    print(f"User ID: {profile.userid}")
    print(f"Number of Posts: {profile.mediacount}")
    print(f"Followers: {profile.followers}")
    print(f"Following: {profile.followees}")
    print(f"Bio: {profile.biography}")
    print(f"External URL: {profile.external_url}")
except Exception as e:
    print(f"Error fetching profile: {e}")
