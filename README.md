# 🚀 Multithreading Download Simulator (Fake Download Manager)

## 📌 Overview
A Java-based simulation of a file download manager demonstrating concurrent execution using multithreading.

Each file download runs on a separate thread, producing interleaved output that mimics real-world parallel processing.

---

## 🎯 Objective
To understand how multiple tasks can execute simultaneously using Java threads and how concurrency behaves in practice.

---

## 🧠 Concepts Applied
- Thread creation using `Runnable`
- Thread lifecycle (`start()` vs `run()`)
- Concurrency and parallel execution
- `Thread.sleep()` for simulating delays
- Randomized execution timing

---

## ⚙️ Features
- Simulates multiple file downloads concurrently
- Each download progresses from 0% to 100%
- Random delay to imitate real network conditions
- Clear console output showing parallel execution

---

## 🏗️ Project Structure

com.mickey
│
├── Main.java // Entry point: initializes and starts threads
└── DownloadTask.java // Contains download simulation logic


---

## ▶️ Execution Flow
1. Main class creates multiple threads
2. Each thread is assigned a `DownloadTask`
3. Threads are started using `.start()`
4. Each thread:
   - Prints progress
   - Sleeps for a random duration
5. Output appears interleaved due to concurrent execution

---

## 🧪 Sample Output

File 1 : Downloading 10%
File 3 : Downloading 20%
File 2 : Downloading 10%
File 4 : Downloading 30%
...


---

## 🔍 Key Observations
- Output order is unpredictable due to thread scheduling
- Using `.run()` instead of `.start()` results in sequential execution
- Threads operate independently unless explicitly synchronized

---

## 🚀 Learning Outcomes
- Practical understanding of multithreading
- Difference between sequential and concurrent execution
- Hands-on experience with thread behavior and timing

---

## 🛠️ Future Enhancements
- Implement thread synchronization
- Introduce a download queue system
- Limit concurrent threads (thread pool)
- Add logging instead of console prints
- Build a GUI-based downloader

---

## 👨‍💻 Author
Mickey
