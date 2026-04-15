# ✅ Day 1
### Concept:
- Big-O, Big-Theta, Big-Omega
- Constant vs Linear vs Log

### Practice:
- 3 Easy array problems (search, max, sum)

### Revision:
- Re-solve 1 without looking

---

# 🚀 1️⃣ What is Big-O?

👉 Big-O measures how fast an algorithm grows when input size (n) increases.

It does NOT measure:
- seconds
- CPU speed

It measures:
- Growth of operations as n becomes large

---

# 🧠 2️⃣ Why Big-O?

Because when n is small → everything looks fast
When n is large → differences become HUGE

Example:

| n         | O(n) | O(n²)         |
| --------- | ---- | ------------- |
| 10        | 10   | 100           |
| 100       | 100  | 10,000        |
| 1,000,000 | 1M   | 1 trillion 💥 |

---

# 📊 3️⃣ Common Time Complexities

### 🟢 O(1) — Constant

int x = arr[0];

✔ Always same time

✔ Fastest

### 🟢 O(n) — Linear

for(int i = 0; i < n; i++) { }

✔ Grows with n

### 🟢 O(n²) — Quadratic

for(int i = 0; i < n; i++) {

    for(int j = 0; j < n; j++) {}
}

✔ Very slow for large n

### 🟢 O(log n) — Logarithmic

for(int i = n; i > 1; i /= 2) { }

✔ Very efficient

✔ Reduces problem size

### 🟢 O(n log n)

for(int i = 0; i < n; i++) {

    for(int j = 1; j < n; j *= 2) { }
}

✔ Balanced performance

✔ Used in sorting

### 🟢 O(2ⁿ) — Exponential

// recursion calling twice

✔ Very slow

✔ Avoid if possible

📈 Visual Growth Understanding

photo

---

##💎 4️⃣ Golden Rules

🔹 Rule 1: Ignore Constants

O(2n) = O(n)

O(n² + 5n) = O(n²)

🔹 Rule 2: Take Highest Growth

O(n + n²) = O(n²)

🔹 Rule 3: Sequential → Add

for(i<n)

for(j<n)

O(n) + O(n) = O(n)

🔹 Rule 4: Nested → Multiply

for(i<n)

   for(j<n)
   
O(n × n) = O(n²)

🔹 Rule 5: Halving → Log

i /= 2

i *= 2

O(log n)

---

## 🧠 5️⃣ Important Patterns

🔥 Pattern 1
for(int i = 0; i < n; i++)

👉 O(n)

🔥 Pattern 2
for(int i = 0; i < n; i++)
   for(int j = 0; j < n; j++)

👉 O(n²)

🔥 Pattern 3
for(int i = 1; i < n; i *= 2)

👉 O(log n)

🔥 Pattern 4
for(int i = 0; i < n; i++)
   for(int j = 1; j < n; j *= 2)

👉 O(n log n)

🔥 Pattern 5 (IMPORTANT)
for(int i = 1; i < n; i *= 2)
   for(int j = 0; j < i; j++)

👉 O(n) ❗ (geometric series)

🔥 Pattern 6 (Shrinking)
for(int i = n; i > 0; i /= 2)
   for(int j = 0; j < i; j++)

👉 O(n)


---

## 🧠 6️⃣ Geometric Series Trick (VERY IMPORTANT)

If you see:

1 + 2 + 4 + 8 + ... + n

👉 Result:

O(n)

If you see:

n + n/2 + n/4 + ...

👉 Result:

O(n)

## ⚠️ 7️⃣ Common Mistakes

❌ Every nested loop is O(n²)

✔ Not true — check dependency

❌ Always multiply loops

✔ Sometimes you must sum

❌ Ignore halving

✔ That is log n

## 🧠 8️⃣ Real Examples

🔍 Linear Search

for(int i = 0; i < n; i++)

👉 O(n)

🔝 Find Max

👉 O(n)

➕ Sum Array

👉 O(n)

🔎 Binary Search

👉 O(log n)

## 🚀 9️⃣ Growth Ranking (MOST IMPORTANT)

O(1)O(log n)O(n)O(n log n)O(n²)O(n³)O(2ⁿ)

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

for(int i = n; i > 0; i /= 2) {

    System.out.println(i);
}

Q5

for(int i = 0; i < n; i++) {

    System.out.println(i);
}

for(int j = 0; j < n; j++) {

    System.out.println(j);
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

...


