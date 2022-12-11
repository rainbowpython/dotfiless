import tkinter as tk
from tkinter import filedialog
from tkinter import ttk
#from tkinter.filedialog import askopenfilename
running = True
cancel = 0
imageExtentionStrings = ["jpeg", "png", "jpg", "webp", "img"]

root = tk.Tk()
#root.withdraw()

style = ttk.Style(root)
root.option_add('*foreground', 'black')  # set all tk widgets' foreground to red
root.option_add('*activeForeground', 'black')  # set all tk widgets' foreground to red

#style.configure('TLabel', foreground='red')
#style.configure('TEntry', foreground='red')
#style.configure('TMenubutton', foreground='red')
#style.configure('TButton', foreground='red')


style.configure('Treeview', background='red')

filedialog.askopenfilename(master=root, filetypes=[('*', '*'), ('PNG', '*.png')], initialdir="/home")
root.mainloop()


#path = easygui.fileopenbox()  

#while running:
 #   print("s")
    
