

## 🚀 1️⃣ What is Big-Omega (Ω)?

👉 Big-Omega tells the minimum time an algorithm must take.

Ω = Lower Bound (best-case guarantee)

Meaning:

“Algorithm will take at least this much time.”

---

## 🧠 2️⃣ Why Big-Omega?

Because:
- Big-O → maximum time
- Big-Theta → exact time
- Big-Omega → minimum time

👉 It tells how fast the algorithm can possibly be (best case)

---

## 📊 3️⃣ Formal Definition

f(n) = Ω(g(n))

If:

f(n) ≥ c * g(n)

For:
- constant c > 0
- large n

---

## 💡 4️⃣ Simple Meaning

👉 Big-Omega = minimum work required

Even in the best case, the algorithm must do this much work.

---

## 🟢 5️⃣ Basic Examples

Example 1

for(int i = 0; i < n; i++) {

System.out.println(i);

}

👉 Always runs n times

Ω(n)

Example 2

int x = arr[0];

👉 Always 1 operation

Ω(1)

Example 3 — Linear Search

for(int i = 0; i < n; i++) {

if(arr[i] == target) return i;

}

Cases:
- Best case → found at first index → Ω(1)
- Worst case → O(n)
- Average → Θ(n)



📈 Visual Understanding

photo

---

## 💎 6️⃣ Key Rules

🔹 Rule 1: Ignore constants

Ω(5) = Ω(1)Ω(2n) = Ω(n)

🔹 Rule 2: Minimum work matters

👉 Think:

What is the least work algorithm must do?

🔹 Rule 3: Early break matters

for(int i = 0; i < n; i++) {

break;

}

👉 Ω(1)

---

## 🧠 7️⃣ Important Patterns

🔥 Pattern 1

for(i < n)

👉 Ω(n)

🔥 Pattern 2

for(i < n)  for(j < n)

👉 Ω(n²)

🔥 Pattern 3

i *= 2

👉 Ω(log n)

🔥 Pattern 4 (Break early)

for(i < n)   if(condition) break;

👉 Ω(1)

🔥 Pattern 5

for(i < n)   for(j < n)      if(j == 0) break;

👉 Ω(n)

## ⚠️ 8️⃣ Common Mistakes

❌ Thinking Ω is always same as O

✔ It depends on best case

❌ Ignoring break condition

✔ Break can reduce to constant

❌ Always taking full loop

✔ Think minimum work

## 🔁 9️⃣ Relationship

Ω ≤ Θ ≤ O

Example

f(n) = 3n + 5

Ω(n)Θ(n)O(n)

## 🧠 🔟 Real Examples

🔍 Linear Search

CaseComplexityBestΩ(1)AvgΘ(n)WorstO(n)

🔎 Binary Search

CaseComplexityBestΩ(1)AvgΘ(log n)WorstO(log n)

🔝 Find Max

👉 Ω(n)

(you must check all elements)

## 🚀 1️⃣1️⃣ Growth Ranking

Ω(1)Ω(log n)Ω(n)Ω(n log n)Ω(n²)

## 🎯 Final Summary

👉 Ω = minimum time

👉 Focus on best case

👉 Check early break

👉 Ignore constants

👉 Think: “minimum work required?”

