# Quick Sort

Quick Sort is a sorting technique that sorts a list by:

1. Picking one element called a **pivot**
2. Splitting the list into smaller parts
3. Sorting those parts separately

**pivot** is an element used as a reference point to divide a larger data set into smaller, more manageable pieces.

It is called **Divide and Conquer** because it:

1. Divides the array
This step involves breaking the array into two sub-arrays.

2. Conquers (sorts) each part
This step receives two smaller sub-arrays to be sorted.


3. Merge them automatically (no extra merging needed, like Merge Sort)
When the two sub-arrays are sorted, this stage recursively combines them.

## 🔷 Step-by-Step Example for better understanding

Let’s sort:

👉 **```[10, 7, 8, 9, 1, 5]```**

### ✅ Step 1: Choose Pivot

Let’s pick last element as pivot:

👉 Pivot = 5

### ✅ Step 2: Partition (Very Important Step)

Rearrange so:

Smaller than 5 → left
Greater than 5 → right

**Result:**

👉 ```[1] 5 [10, 7, 8, 9]```

Now:

5 is already in correct position ✔️

### ✅ Step 3: Sort Left Side

Left: ```[1]```

Already sorted.

### ✅ Step 4: Sort Right Side

Right: ```[10, 7, 8, 9]```

Pick pivot = 9

Partition:
👉 ```[7, 8] 9 [10]```

Now:

9 fixed ✔️

### ✅ Step 5: Sort [7, 8]

Pivot = 8

👉 ```[7] 8```

### 🎉 Final Sorted Array:

👉 ```[1, 5, 7, 8, 9, 10]```

---

## 🔷 Why Quick Sort is Fast?

Because:

- It doesn’t compare everything with everything
- Each step reduces problem size quickly
- Works like splitting a big problem into small ones

---

## 🔷 Time Complexity

| Case     | Performance | 
|----------|-------------|
| Best     | O(n log n)  | 
| Average  | O(n log n)  | 
| Worst    | O(n²)       | 

---

## 🔷 Space Complexity

- O(log n) (due to recursion)

---

## 🔷 Advantages

- Very fast in practice
- Works in-place (needs little extra memory)
- Widely used in real systems

---

## 🔷 Disadvantages

- Worst-case performance is O(n²)
- Not stable (equal elements may change order)






