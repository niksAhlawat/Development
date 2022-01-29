import datetime as dt
import win32com.client

#Connection to Task Scheduler
task = win32com.client.Dispatch('Schedule.Service')
task.Connect()
root_folder = task.GetFolder('\\')
newtask = task.NewTask(0)

# Trigger

set_time=dt.datetime(2022,1,28,22,36,0,500000)
TASK_TRIGGER_TIME = 1
trigger = newtask.Triggers.Create(TASK_TRIGGER_TIME)
trigger.StartBoundary = set_time.isoformat()

# Action
TASK_ACTION_EXEC = 0
action = newtask.Actions.Create(TASK_ACTION_EXEC)
action.ID = 'DO NOTHING'
action.Path = r'C:\Users\nikhi\anaconda3\Scripts'
action.Arguments = r'C:\Users\nikhi\Desktop\Development\python\task_scheduler.py'

# Parameters
newtask.RegistrationInfo.Description = 'Python Task Test'
newtask.Settings.Enabled = True
newtask.Settings.StopIfGoingOnBatteries = False

# Saving
TASK_CREATE_OR_UPDATE = 6
TASK_LOGON_NONE = 0
root_folder.RegisterTaskDefinition(
    'PTT2',  # Python Task Test
    newtask,
    TASK_CREATE_OR_UPDATE,
    '',  # No user
    '',  # No password
    TASK_LOGON_NONE)