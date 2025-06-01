Day 6 : 29/04/2024 : Arham Mian : aarhammi@amazon.com

=============================================================================

----------------------Linux fundamentals-------------------------

=============================================================================

---

### **Task 1: RegEx Symbols in Linux**

| Symbol | Description                               |            |
| ------ | ----------------------------------------- | ---------- |
| `.`    | Matches any single character              |            |
| `*`    | Matches zero or more of the previous char |            |
| `^`    | Anchors the match at the beginning        |            |
| `$`    | Anchors the match at the end              |            |
| `[]`   | Matches any one character inside brackets |            |
| `[^]`  | Matches any character not in brackets     |            |
| `\`    | Escapes a special character               |            |
| \`     | \`                                        | Logical OR |
| `()`   | Groups expressions                        |            |

---

### **Task 2: Important Features of Linux OS**

* Open-source and free
* Multiuser and multitasking
* Highly secure and stable
* Portable across platforms
* Large community and support
* Command-line and GUI options
* Excellent for programming and networking

---

### **Task 3: What is Kernel and Its Functions**

* The **Kernel** is the core of the Linux OS.
* It manages CPU, memory, devices, and system calls.
* Functions:

  * Process management
  * Memory management
  * Device I/O control
  * File system management

---

### **Task 4: What is BASH?**

* **BASH**: *Bourne Again SHell*
* It's a command-line shell and scripting language.
* Used to interact with the system, run scripts, manage files and processes.

---

### **Task 5: Difference Between Windows and Linux**

| Feature   | Windows               | Linux               |
| --------- | --------------------- | ------------------- |
| Source    | Closed-source         | Open-source         |
| Cost      | Paid license          | Free                |
| Security  | More vulnerable       | More secure         |
| Customiz. | Limited customization | Highly customizable |

---

### **Task 6: Basic Components of Linux**

* **Kernel** – core system
* **Shell** – command interpreter
* **File System** – stores data
* **Utilities** – standard commands and tools
* **User Space** – user programs

---

### **Task 7: Is Editing the Kernel Legal?**

Yes, it's legal if the kernel is open-source (like Linux), but it's risky without expertise.

---

### **Task 8: What is LILO?**

* **LILO**: Linux Loader
* A boot loader for Linux used to load the OS into memory at boot.

---

### **Task 9: What is a Shell? Types of Shells**

* **Shell**: Interface between user and OS
* Types:

  * **BASH**
  * **Korn shell (ksh)**
  * **C shell (csh)**
  * **Z shell (zsh)**
  * **Sh** (Bourne shell)

---

### **Task 10: What is Swap Space?**

* Space on disk used as virtual memory when RAM is full.
* Helps prevent crashes during heavy RAM usage.

---

### **Task 11: What is Mount?**

* **Mounting** connects a storage device to the file system.

```bash
mount /dev/sdb1 /mnt
umount /mnt
```

---

### **Task 12: chmod Command**

* Used to change file permissions.

```bash
chmod 755 file.txt
```

---

### **Task 13: Create a New User**

```bash
sudo adduser newusername
# or
sudo useradd newusername
```

---

### **Task 14: Change Password of a User**

```bash
sudo passwd username
```

---

### **Task 15: Process vs Thread**

* **Process**: Independent program with its own memory.
* **Thread**: Lightweight sub-process, shares memory with other threads.

---

### **Task 16: 14 grep Command Examples**

(Examples assuming a file with content)

```bash
grep "text" file.txt           # Match exact text
grep -i "text" file.txt        # Case-insensitive
grep -r "text" /path           # Recursive search
grep -v "text" file.txt        # Exclude matches
grep -n "text" file.txt        # Show line numbers
grep -c "text" file.txt        # Count matches
grep -l "text" *.txt           # List matching files
grep "^text" file.txt          # Starts with
grep "text$" file.txt          # Ends with
grep -e "text1" -e "text2" file.txt
grep -w "word" file.txt        # Match whole word
grep --color=auto "text" file.txt
grep -A 2 "text" file.txt      # Show 2 lines after match
grep -B 2 "text" file.txt      # Show 2 lines before match
```

---

### **Task 17: AWK Commands**

(Examples using a file `data.txt`)

```bash
awk '{print}' data.txt            # Print all lines
awk '{print $1}' data.txt         # Print first column
awk '/pattern/' data.txt          # Print lines matching pattern
awk '{sum += $2} END {print sum}' data.txt  # Sum second column
awk 'NR==1' data.txt              # Print first line
```

---

### **Task 18: Check File Access Permissions**

```bash
ls -l filename.txt
```

---

### **Task 19: Default Permissions**

By default (with `umask` 022):

* Owner: Read & Write (rw-)
* Group: Read (r--)
* Others: Read (r--)

---

### **Task 20: Change Permissions to Read-only for All**

```bash
chmod 444 filename.txt
```

---

### **Task 21: Set Permissions**

```bash
chmod 640 filename.txt
# rw-r-----
```

---

### **Task 22: Command for `-rw-r-----`**

```bash
chmod 640 filename.txt
```

---

### **Task 23: Set Permissions**

```bash
chmod 751 chmod.exercises
# -rwxr-x--x
```

---

### **Task 24: Command to Achieve `-rwxr-x--x`**

```bash
chmod 751 filename
```

---

### **Task 25: chown -c master file1.txt**

Changes ownership of `file1.txt` to user `master` and prints a message if successful.

---

### **Task 26: Define a Process**

A process is a running instance of a program with its own memory and system resources.

---

### **Task 27: Foreground and Background Process Commands**

* Foreground: Just run normally (`./script.sh`)
* Background: Add `&`

```bash
./script.sh &
jobs
```

---

### **Task 28: List All Running Processes**

```bash
ps aux
```

---

### **Task 29: What does `ps -f` Do?**

Displays processes in full-format listing:

```bash
UID  PID  PPID  C  STIME  TTY  TIME  CMD
```

---

### **Task 30: Create a Variable and Print It**

```bash
Name="prasunamba"
echo $Name
```

---

### **Task 31: Make Variable Read-only**

```bash
readonly Name
Name="Meher"
# Output: bash: Name: readonly variable
```

---

### **Task 32: Unset or Delete Variable**

```bash
unset Name
echo $Name  # Output will be blank
```

Reason: `unset` removes the variable from memory.

---

### **Task 33: Add Friend Names in Array and Print**

```bash
NAME[0]="Ram"
NAME[1]="Sita"
NAME[2]="Tina"
NAME[3]="Veena"
NAME[4]="Tim"

echo "First: ${NAME[0]}"
echo "Second: ${NAME[1]}"
```

---

### **Task 34: Print All Array Items**

```bash
echo "${NAME[*]}"
echo "${NAME[@]}"
```

---

### **Task 35: Loop Output Snippet**

```bash
a=0
while [ "$a" -lt 10 ]
do
   b="$a"
   while [ "$b" -ge 0 ]
   do
      echo -n "$b "
      b=`expr $b - 1`
   done
   echo
   a=`expr $a + 1`
done
```

**Output:**

```
0
1 0
2 1 0
3 2 1 0
...
9 8 7 6 5 4 3 2 1 0
```

---

