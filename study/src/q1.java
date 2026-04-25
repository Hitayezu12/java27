/*
(a) Library Management System
1. How Java decision-making works

Java uses:
-> if-else → checks many conditions step by step
-> switch-case → selects from fixed options

In this system (Certificate, Diploma, Undergraduate, Postgraduate), the values are fixed, so switch-case is better because:

It is clean and easy to read
Faster to understand and maintain

String level = "Undergraduate";

switch(level) {
    case "Certificate":
        System.out.println("Basic books only");
        break;
    case "Diploma":
        System.out.println("Basic + Intermediate books");
        break;
    default:
        System.out.println("Invalid level");


String level = "Diploma";

if (level.equals("Certificate")) {
    System.out.println("Access: Basic books only");
    } 
else {
    System.out.println("Invalid level");
    }


2. Input Validation & Error Handling

This means checking user input before using it.


If someone enters nothing → show error
If someone enters wrong level → reject it

✔ Why important:
Prevents system crashes
Avoids wrong access (e.g., giving full access to wrong user)
Makes system more reliable and safe

3. Limitations of Basic Conditions

Using only if-else or switch:

Becomes too long and messy when system grows
Hard to update (you must change code every time)

✔ Better Solutions:
Object-Oriented Design (OOP)
→ create classes like Student, AccessLevel
Role-Based Access Control (RBAC)
→ assign roles (e.g., Undergraduate = specific permissions)

👉 These make the system:

Easier to manage
More scalable (can grow easily)

===========================================================
(b) Student Attendance System (Java IDEs)
🔹 1. Comparing IDEs

🟢 NetBeans IDE
Easy to use
Built-in drag-and-drop GUI builder
Good for beginners

🔵 IntelliJ IDEA
Very powerful and fast
Smart suggestions (helps write code faster)
Best for big projects

2. How IDE Features Help
Debugging tools
→ find and fix errors easily
Version control (Git)
→ track changes and work in teams
GUI builders
→ design interfaces quickly

👉 Result:

Better quality software
Easier maintenance
Faster development
🔹 3. Best IDE for This Project

👉 Best choice: IntelliJ IDEA

✔ Why:
Handles large systems well
Strong debugging and tools
Used in professional environments

👉 But:

NetBeans IDE is still good for beginners and simple GUI work
*/
