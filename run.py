import tkinter as tk
import subprocess
from tkinter import filedialog
from tkinter import ttk


imagefileextensions = [".jpeg", ".png", ".jpg", ".webp", ".img"]

root = tk.Tk()
#root.withdraw(

style = ttk.Style(root)
#i got this from stackoverflow
root.option_add('*foreground', 'black')  # set all tk widgets' foreground to red
root.option_add('*activeForeground', 'black')  # set all tk widgets' foreground to red

image = filedialog.askopenfilename(master=root,
                                  filetypes=[("Image files", imagefileextensions )],
                                  initialdir="~",)
script = open("pywal.sh", "w")
script.write("wal -i " + image)
script.close()

subprocess.call(['sh', './pywal.sh'])

root.mainloop()