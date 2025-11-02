import subprocess

proceso=subprocess.Popen(
    ["ip","a"] ,
    stdin=subprocess.PIPE ,
    stdout=subprocess.PIPE , 
    text=True
)

