Day 5 : 28/04/2024 : Arham Mian : aarhammi@amazon.com

=============================================================================

----------------------Linux fundamentals-------------------------

=============================================================================

##  **Task 1: Create a Directory with the Name `Linux Practice`**

```bash
mkdir "Linux Practice"
```

=============================================================================

##  **Task 2: Change to the Directory**

```bash
cd "Linux Practice"
```

=============================================================================

##  **Task 3: Create a File `TestFile1.txt` and Add Content to It**

```bash
echo "This is a test file" > TestFile1.txt
```

To verify:

```bash
cat TestFile1.txt
```

=============================================================================

##  **Task 4: Create a Folder Named `Dummy` and Try to Delete It**

```bash
mkdir Dummy       # Create folder
rmdir Dummy       # Delete folder (works only if empty)
```

If `Dummy` is not empty, `rmdir` will show an error like:

```
rmdir: failed to remove 'Dummy': Directory not empty
```

=============================================================================

##  **Task 5: Check the Working Directory**

```bash
pwd
```

It will print something like:

```
/home/username/Linux Practice
```

=============================================================================

##  **Task 6: Check All Files and Directories in the Current Directory**

```bash
ls -la
```

* `ls` lists files.
* `-l` gives detailed info.
* `-a` shows hidden files (like `.bashrc`).

=============================================================================

##  **Task 7: Create Files `TestFile2.txt` to `TestFile6.txt`**

```bash
touch TestFile2.txt TestFile3.txt TestFile4.txt TestFile5.txt TestFile6.txt
```

Or use a loop:

```bash
for i in {2..6}; do
  touch TestFile$i.txt
done
```

=============================================================================

##  **Task 8: Copy All Files from `Dir1` to `Dir2`**

Assuming you're in the parent directory and both directories exist:

```bash
cp Dir1/* Dir2/
```

To include hidden files:

```bash
cp -r Dir1/. Dir2/
```

=============================================================================

##  **Task 9: Move All Files from `Dir2` to `Dir3`**

```bash
mv Dir2/* Dir3/
```

To verify `Dir2` is empty:

```bash
ls Dir2
```

=============================================================================

##  **Task 10: Difference Between `rm` and `rmdir`**

### 🔹 `rmdir`

* Used to delete **empty** directories only.

* Example:

  ```bash
  mkdir tempdir
  rmdir tempdir  # Works
  ```

* If not empty:

  ```bash
  rmdir tempdir
  # Error: rmdir: failed to remove 'tempdir': Directory not empty
  ```

=============================================================================

### 🔸 `rm`

* Used to remove **files** and **non-empty directories**.
* Example:

  ```bash
  rm filename.txt              # Remove a file
  rm -r non_empty_folder/      # Remove folder and all its contents
  ```

=============================================================================

##  **Task 11: Use `cat` to Create a File with Dummy Text**

```bash
cat > dummyfile.txt
```

=============================================================================

##  **Task 12: View the Top Part of the File Using `head`**

```bash
head dummyfile.txt
```

This shows the **first 10 lines** by default.
To show more or less lines:

```bash
head -n 5 dummyfile.txt
```

=============================================================================

##  **Task 13: View the Last Part of the File Using `tail`**

```bash
tail dummyfile.txt
```

Shows the **last 10 lines**. To show last 5 lines:

```bash
tail -n 5 dummyfile.txt
```

=============================================================================

##  **Task 14: Add 5–6 Pages of Dummy Text and View Page-by-Page**

### Add more dummy text (you can copy-paste paragraphs again):

```bash
cat >> dummyfile.txt
```

Paste multiple paragraphs. Press `Ctrl + D` to save.

### View file page-by-page:

```bash
less dummyfile.txt
```

Use:

* `Space` to go down a page
* `b` to go back a page
* `q` to quit

=============================================================================

##  **Task 15: Use `more` Command and See the Difference with `less`**

```bash
more dummyfile.txt
```

**Difference between `less` and `more`:**

| Feature          | `less`                | `more`                   |
| ---------------- | --------------------- | ------------------------ |
| Scroll up/down   | Yes (`b`, `space`)    | Down only (no scroll up) |
| Search (`/word`) | Yes                   | Limited                  |
| Performance      | Faster with big files | Slower with large files  |

=============================================================================

##  **Task 16: Use `echo -e` and See the Difference**

```bash
echo "Line1\nLine2"
# This will print \n literally

echo -e "Line1\nLine2"
# This will interpret \n as a newline
```

Use `-e` to enable interpretation of escape sequences like:

* `\n` (newline)
* `\t` (tab)

=============================================================================

##  **Task 17: Difference Between `ls` and `ls -l`**

```bash
ls        # Lists file names
ls -l     # Lists with details (permissions, size, date, owner)
```

**Example Output:**

```
ls
file1.txt  file2.txt

ls -l
-rw-r--r-- 1 user user 0 May 31 12:00 file1.txt
-rw-r--r-- 1 user user 0 May 31 12:01 file2.txt
```

=============================================================================

##  **Task 18: Create a File Using `touch`, `cat`, and `echo`**

```bash
touch touchfile.txt
cat > catfile.txt
# Type something, then Ctrl + D
echo "This is from echo" > echofile.txt
```

**Difference:**

| Command | Purpose                                |
| ------- | -------------------------------------- |
| `touch` | Creates empty file                     |
| `cat`   | Creates file and lets you type content |
| `echo`  | Writes predefined content to a file    |

=============================================================================

##  **Task 19: Display the Calendar Using `cal`**

```bash
cal
```

This shows the current month’s calendar.

=============================================================================

##  **Task 20: Go Back to One Directory**

```bash
cd ..
```

This takes you **up one level** in the directory tree.

=============================================================================

##  **Task 21: Check Which User You're Logged In As**

```bash
whoami
```

Returns the username you're currently using.

=============================================================================

##  **Task 22: Check Who’s Logged into the System**

```bash
users     # Shows usernames of people logged in
who       # Shows more details (terminals, login time)
w         # Shows who is logged in and what they are doing
```

=============================================================================

##  **Task 23: Check Disk Space Usage**

```bash
df -h
```

`-h` shows sizes in **human-readable format** (e.g., GB, MB)

**Sample Output:**

```
Filesystem      Size  Used Avail Use% Mounted on
/dev/sda1        50G   20G   28G  42% /
```

=============================================================================

##  **Task 24: Understanding File Type Prefixes**

### 🔹 Use the following command:

```bash
ls -l
```

Output

```
-rw-r--r--  1 Ubuntu Ubuntu   1234 May 31 13:00 file.txt
drwxr-xr-x  2 Ubuntu Ubuntu   4096 May 31 13:01 myfolder
lrwxrwxrwx  1 Ubuntu Ubuntu     11 May 31 13:02 link -> file.txt
```

Break down of the prefixes:

---

| Prefix | Description                                                                                             |
| ------ | ------------------------------------------------------------------------------------------------------- |
| `-`    | **Regular file**: Normal files (text, executables, etc.)                                                |
| `d`    | **Directory**: A folder that contains other files/directories                                           |
| `l`    | **Symbolic link**: A shortcut or reference to another file or directory                                 |
| `b`    | **Block special file**: Used for devices that read/write in blocks (e.g., hard disks)                   |
| `c`    | **Character special file**: Used for devices that handle data one character at a time (e.g., keyboards) |
| `p`    | **Named pipe (FIFO)**: Used for inter-process communication                                             |
| `s`    | **Socket**: Another way for processes to communicate (used in networking)                               |

---

##  Examples to Try:

### 1. Create a regular file:

```bash
touch regularfile.txt
ls -l regularfile.txt
# Output: starts with -
```

### 2. Create a directory:

```bash
mkdir testdir
ls -ld testdir
# Output: starts with d
```

### 3. Create a symbolic link:

```bash
ln -s regularfile.txt symlinkfile
ls -l symlinkfile
# Output: starts with l
```

### 4. View device files:

```bash
ls -l /dev/sda    # Block device: starts with b
ls -l /dev/tty    # Character device: starts with c
```

### 5. Create a named pipe:

```bash
mkfifo mypipe
ls -l mypipe
# Output: starts with p
```

### 6. View socket (if exists):

```bash
ls -l /var/run/docker.sock
# Output: starts with s
```

Great! Here's a step-by-step guide to help you complete **Tasks 25 to 34** using correct Linux commands, just like the previous tasks — all clean, clear, and with examples (no emojis, no distractions).

=============================================================================

## **Task 25: Find All Files Ending with `.txt`**

```bash
ls *.txt
```

This lists all files in the current directory that end with `.txt`.

=============================================================================

##  **Task 26: Check All Hidden Files in Linux**

```bash
ls -a
```

* `ls` shows files.
* `-a` includes hidden files (those starting with a dot `.`).

=============================================================================

## **Task 27: Difference Between `.` and `..` in Linux**

* `.` refers to the **current directory**.
* `..` refers to the **parent directory** (one level up).

=============================================================================

## **Task 28: Create a File Using `vi` Editor**

### Steps:

1. Open a file in `vi`:

   ```bash
   vi myfile.txt
   ```
2. Press `i` to enter **insert mode**.
3. Type some content.
4. Press `Esc` to leave insert mode.
5. Press `Shift + ZZ` to **save and exit**.

### Navigation keys inside `vi`:

* `h`: move left
* `l`: move right
* `j`: move down
* `k`: move up

=============================================================================

## **Task 29: Find the Number of Words in a File**

```bash
wc myfile.txt
```

### Example Output:

```
10 20 150 myfile.txt
```

Meaning:

* **10** → number of lines
* **20** → number of words
* **150** → number of bytes
* `myfile.txt` → file name

=============================================================================

## **Task 30: Use of `cat -b myfilename.txt`**

```bash
cat -b myfile.txt
```

This command displays the file **with line numbers**, but **only for non-blank lines**.

=============================================================================

## **Task 31: Use `wc` with 2 or More Files**

```bash
wc file1.txt file2.txt
```

It will display line, word, and byte counts for each file, and then a total.

=============================================================================

## **Task 32: Copy Content of One File to Another**

```bash
cp source.txt destination.txt
```

This copies the content of `source.txt` into `destination.txt`.

=============================================================================

## **Task 33: Rename a File Using `mv`**

```bash
mv oldfile.txt MYFILENEW.txt
```

This renames the file to `MYFILENEW.txt`.

=============================================================================

## **Task 34: Delete Multiple Files in Linux**

```bash
rm file1.txt file2.txt file3.txt
```

We can list as many filenames as needed, separated by spaces.

=============================================================================

## **Task 35: What Happens When You Run `cd /`?**

```bash
cd /
```

* This command takes you to the **root directory** of the Linux file system.
* The root directory is the top-level directory (`/`) that contains all other directories like `bin`, `etc`, `home`, `usr`, etc.

To confirm:

```bash
pwd
```

Output:

```
/
```
=============================================================================

##  **Task 36: How to Go to the Home Directory**

```bash
cd ~
```

or simply:

```bash
cd
```

* Both commands return you to your **home directory**, e.g., `/home/username`.

To confirm:

```bash
pwd
```

=============================================================================

## **Task 37: Move to Another User’s Home Directory**

```bash
cd ~username
```

Replace `username` with the actual user's name.

**Example:**

```bash
cd ~john
```

This will take you to the `/home/john` directory if:

* The user `john` exists
* You have permission to access their home directory

=============================================================================

## **Task 38: `chmod` Command – Use and Examples**

### 📌 Purpose:

`chmod` (change mode) is used to set **file or directory permissions** in Linux.

### 🔹 Example 1: Give read, write, and execute permissions to the user

```bash
chmod u+rwx filename.txt
```

* `u` = user (owner)
* `+rwx` = add read, write, execute

---

### 🔹 Example 2: Remove write permission from group

```bash
chmod g-w filename.txt
```

* `g` = group
* `-w` = remove write permission

---

### 🔹 Example 3: Numeric Mode

```bash
chmod 755 filename.sh
```

| Value | Permission                     |
| ----- | ------------------------------ |
| `7`   | Read + Write + Execute (`rwx`) |
| `5`   | Read + Execute (`r-x`)         |
| `0`   | No permission (`---`)          |

So `755` means:

* Owner: rwx
* Group: r-x
* Others: r-x

---

### 🔹 View Permissions:

```bash
ls -l filename.txt
```

**Output:**

```
-rwxr-xr-x  1 user user 123 May 31 16:10 filename.txt
```


