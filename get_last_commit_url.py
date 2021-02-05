from urllib.request import urlopen
import json

owner = "kalenikov"
repo = "job4j_elementary"

url = f'https://api.github.com/repos/{owner}/{repo}/commits?per_page=10'

response = urlopen(url).read()
data = json.loads(response.decode())

for commit in data[::-1]:
    print('--------------')
    # print(commit['commit']['message'], commit['commit']['author']["date"])
    print(commit['commit']['message'], commit['html_url'])
    # print(commit['html_url'])
