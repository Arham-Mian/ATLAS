Absolutely! Here's a step-by-step guide to help you with all **10 Linux command-line tasks**, along with examples and explanations. For **Task 10**, I’ll describe the difference between `rm` and `rmdir` (since I can’t take screenshots, I’ll clearly show example outputs instead).

---

##  **Task 1: Create a Directory with the Name `Linux Practice`**

```bash
mkdir "Linux Practice"
```

---

##  **Task 2: Change to the Directory**

```bash
cd "Linux Practice"
```

---

##  **Task 3: Create a File `TestFile1.txt` and Add Content to It**

```bash
echo "This is a test file" > TestFile1.txt
```

To verify:

```bash
cat TestFile1.txt
```

---

##  **Task 4: Create a Folder Named `Dummy` and Try to Delete It**

```bash
mkdir Dummy       # Create folder
rmdir Dummy       # Delete folder (works only if empty)
```

If `Dummy` is not empty, `rmdir` will show an error like:

```
rmdir: failed to remove 'Dummy': Directory not empty
```

---

##  **Task 5: Check the Working Directory**

```bash
pwd
```

It will print something like:

```
/home/username/Linux Practice
```

---

##  **Task 6: Check All Files and Directories in the Current Directory**

```bash
ls -la
```

* `ls` lists files.
* `-l` gives detailed info.
* `-a` shows hidden files (like `.bashrc`).

---

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

---

##  **Task 8: Copy All Files from `Dir1` to `Dir2`**

Assuming you're in the parent directory and both directories exist:

```bash
cp Dir1/* Dir2/
```

To include hidden files:

```bash
cp -r Dir1/. Dir2/
```

---

##  **Task 9: Move All Files from `Dir2` to `Dir3`**

```bash
mv Dir2/* Dir3/
```

To verify `Dir2` is empty:

```bash
ls Dir2
```

---

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

---

### 🔸 `rm`

* Used to remove **files** and **non-empty directories**.
* Example:

  ```bash
  rm filename.txt              # Remove a file
  rm -r non_empty_folder/      # Remove folder and all its contents
  ```

