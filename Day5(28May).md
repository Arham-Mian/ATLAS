Day 5 : 28/04/2024 : Arham Mian : aarhammi@amazon.com

=============================================================================

----------------------Dev ops and cloud fundamentals-------------------------

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

Then paste **2–3 paragraphs** of dummy text (e.g., from [lipsum.com](https://www.lipsum.com))
To save and exit: press `Ctrl + D`

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

