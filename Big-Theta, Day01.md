
## 🚀 1️⃣ What is Big-Theta (Θ)?

👉 Big-Theta tells the exact growth rate of an algorithm.

It means:

The algorithm grows at this rate (not faster, not slower)

---

## 🧠 2️⃣ Why Big-Theta?

Big-O → maximum (upper bound)

Big-Omega → minimum (lower bound)

👉 But sometimes we want:

Exact growth → Big-Theta

---

## 📊 3️⃣ Formal Definition

f(n) = Θ(g(n))

If:

c1 * g(n) ≤ f(n) ≤ c2 * g(n)

For large n.

👉 Means:

Lower bound ≤ f(n) ≤ Upper bound

---

## 💡 4️⃣ Simple Meaning

👉 Big-Theta = tight bound

Exact growth rate

---

## 🟢 5️⃣ Basic Examples

Example 1

for(int i = 0; i < n; i++) {

    System.out.println(i);
}

Runs exactly n times →

Θ(n)

Example 2

for(int i = 0; i < n; i++) {

    for(int j = 0; j < n; j++) { }
}

Runs n × n →

Θ(n²)

Example 3

for(int i = 1; i < n; i *= 2) { }

Runs log n →

Θ(log n)

📈 Visual Understanding

photo

---

## 💎 6️⃣ Key Rules

🔹 Rule 1: Ignore constants

Θ(2n) = Θ(n)

Θ(n² / 2) = Θ(n²)


🔹 Rule 2: Highest term matters

Θ(n² + n) = Θ(n²)

🔹 Rule 3: Exact work matters

👉 Big-Theta is about actual work done

---

## 🧠 7️⃣ Important Patterns

🔥 Pattern 1

for(i < n)

👉 Θ(n)

🔥 Pattern 2

for(i < n)

  for(j < n)

👉 Θ(n²)

🔥 Pattern 3

i *= 2

👉 Θ(log n)

🔥 Pattern 4

for(i < n)

  for(j *= 2)

👉 Θ(n log n)

🔥 Pattern 5 (Important)

for(i < n)

  for(j < i)

Total:

1 + 2 + 3 + ... + n ≈ n²

👉 Θ(n²)

🔥 Pattern 6 (Geometric)

for(i *= 2)

  for(j < i)

Total:

1 + 2 + 4 + ... + n ≈ n

👉 Θ(n)

🔥 Pattern 7 (Shrinking)

for(i = n; i > 0; i /= 2)

  for(j < i)

Total:

n + n/2 + n/4 + ...

👉 Θ(n)

## 🧠 8️⃣ Geometric Series Trick

If you see:

1 + 2 + 4 + 8 + ... + n

👉 Θ(n)

If you see:

n + n/2 + n/4 + ...

👉 Θ(n)

## ⚠️ 9️⃣ Common Mistakes

❌ Always multiply loops

✔ Sometimes must sum

❌ Every nested loop is Θ(n²)

✔ Depends on loop relationship

❌ Ignore inner dependency

✔ Must analyze carefully

## 🔁 🔟 Relation with O and Ω

Ω ≤ Θ ≤ O

Example:

f(n) = 3n + 5

Ω(n)

Θ(n)

O(n)

## 🧠 1️⃣1️⃣ Real Examples

🔍 Linear Search

Best → Ω(1)

Average → Θ(n)

Worst → O(n)

🔝 Find Max

👉 Θ(n)

➕ Sum Array

👉 Θ(n)

🔎 Binary Search

👉 Θ(log n)

## 🚀 1️⃣2️⃣ Growth Ranking

Θ(1)

Θ(log n)

Θ(n)

Θ(n log n)

Θ(n²)

Θ(n³)

Θ(2ⁿ)

🎯 Final Summary

👉 Big-Theta = exact growth rate

👉 Use when you know exact work

👉 Combine loops carefully

👉 Use summation when dependent

---

🟢 LEVEL 1 — EASY (1–5)

Q1

for(int i = 0; i < n; i++) {

    System.out.println(i);
}

Q2

for(int i = 0; i < n; i++) {

    for(int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
    }
}

Q3

for(int i = 1; i < n; i *= 2) {

    System.out.println(i);
}

Q4

for(int i = n; i > 1; i /= 2) {

    System.out.println(i);
}

Q5

for(int i = 0; i < n*n; i++) {

    System.out.println(i);
}

🟡 LEVEL 2 — MEDIUM (6–12)

Q6

for(int i = 0; i < n; i++) {

    for(int j = 0; j < i; j++) {
        System.out.println(i + " " + j);
    }
}

Q7

for(int i = 0; i < n; i++) {

    for(int j = i; j < n; j++) {
        System.out.println(i + " " + j);
    }
}

Q8

for(int i = 0; i < n; i++) {

    for(int j = 1; j < n; j *= 2) {
        System.out.println(i + " " + j);
    }
}

Q9

for(int i = 1; i < n; i *= 2) {

    for(int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
    }
}

Q10

for(int i = 1; i < n; i *= 2) {

    for(int j = 0; j < i; j++) {
        System.out.println(i + " " + j);
    }
}

Q11

for(int i = n; i > 0; i /= 2) {

    for(int j = 0; j < i; j++) {
        System.out.println(i + " " + j);
    }
}

Q12

for(int i = 0; i < n; i++) {

    for(int j = 0; j < n*n; j++) {
        System.out.println(i + " " + j);
    }
}

🔴 LEVEL 3 — HARD (13–20)

Q13

for(int i = 0; i < n; i++) {

    for(int j = 0; j < i*i; j++) {
        System.out.println(i + " " + j);
    }
}

Q14

for(int i = 0; i < n; i++) {

    for(int j = 0; j < i*i; j++) {
        for(int k = 0; k < j; k++) {
            System.out.println(i + " " + j + " " + k);
        }
    }
}

Q15

for(int i = 0; i < n; i++) {

    for(int j = 0; j < i; j++) {
        for(int k = 0; k < j; k++) {
            System.out.println(i + " " + j + " " + k);
        }
    }
}

Q16

int i = n;

while(i > 1) {

    i = i / 2;
    for(int j = 0; j < n; j++) {
        System.out.println(j);
    }
}

Q17

int i = 1;

while(i < n) {

    i = i * 2;
    for(int j = 0; j < i; j++) {
        System.out.println(j);
    }
}

Q18

for(int i = 0; i < n; i++) {

    for(int j = 0; j < n; j++) {
        for(int k = 1; k < n; k *= 2) {
            System.out.println(i + " " + j + " " + k);
        }
    }
}

Q19

for(int i = 0; i < n; i++) {

    int j = 1;
    while(j < n) {
        j *= 2;
        System.out.println(i + " " + j);
    }
}

Q20

for(int i = 0; i < n; i++) {

    for(int j = i; j < n; j++) {
        for(int k = j; k < n; k++) {
            System.out.println(i + " " + j + " " + k);
        }
    }
}
