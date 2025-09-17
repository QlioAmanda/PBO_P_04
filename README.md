# PBO Praktikum 4 – Inheritance

Project ini berisi:
1. **Tugas Modul**
   - Exercise 1 → `ex1` (Circle, Cylinder, TestCylinder)
   - Exercise 2 → `ex2` (Shape, Circle, Rectangle, Square, TestShape)
   - Hanya sampai Task 2.1 (sesuai modul)

2. **Program Perkuliahan (KRS Mahasiswa)**
   - `id.ac.polban` (Jurusan, Mahasiswa, MataKuliah, Main)
   - Ditambah inheritance: `MahasiswaSarjana` & `MahasiswaDiploma`

---

## Cara Compile
```bash
javac -d bin src/ex1/*.java src/ex2/*.java src/id/ac/polban/model/*.java src/id/ac/polban/service/*.java

## Cara Run

```Exercise 1
java -cp bin ex1.TestCylinder

```Exercise 2
java -cp bin ex2.TestShape

```Program KRS
java -cp bin id.ac.polban.service.Main

## Konsep

Inheritance: Cylinder→Circle, Rectangle→Shape, Square→Rectangle, MahasiswaSarjana→Mahasiswa

Overriding: getArea(), toString(), setWidth(), setLength()

super: constructor & pemanggilan method parent