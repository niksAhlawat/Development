###Importing libraries
import webbrowser
import time
import win32com.client

###Establishing a shell connection
shell = win32com.client.Dispatch("WScript.Shell")

###Defining some variables
url="www.gmail.com"
email_to="nikhilahlawat.nikk@outlook.com"
subject="Hello World!"
msg="Like a Swiss watch."

###Starting webbrowser
webbrowser.open("url")
time.sleep(9)

###Sending bunch of keys that manage the process from initiation of the email to sending it.
shell.SendKeys("c", 0)
time.sleep(1)
shell.SendKeys("email_to", 0)
time.sleep(1)
shell.SendKeys("{TAB}", 0)
time.sleep(1)
shell.SendKeys("{TAB}", 0)
time.sleep(1)
shell.SendKeys("subject", 0)
time.sleep(1)
shell.SendKeys("{TAB}", 0)
time.sleep(1)
shell.SendKeys("msg", 0)
time.sleep(1)
shell.SendKeys("{TAB}", 0)
time.sleep(1)
shell.SendKeys("{ENTER}", 0)