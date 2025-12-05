# BMI-Calculator
Java program to calculate BMI
BMI Calculator – Java Console Application

This is a simple Java console application that calculates a user’s Body Mass Index (BMI) using height (in feet and inches) and weight (in pounds).
The program then categorizes the BMI into standard health ranges.

📌 Features

Accepts:

Height in feet and inches

Weight in pounds (lb)

Automatically converts feet to inches

Calculates BMI using the U.S. customary formula:

BMI = (703 × weight in pounds) / (height in inches)²


Provides BMI classification:

Underweight

Healthy weight

Overweight

Obese

🧮 How It Works

User enters their height in feet, then inches

User enters their weight in pounds

Program converts total height into inches

BMI is calculated using the formula:

BMI = (703 * weight) / (height * height)


The calculated BMI is displayed

Based on the BMI value, a health category is printed

📂 Code Structure
day3/
 └── BMICalculator.java


The main method handles:

User input via Scanner

Unit conversion (feet → inches)

BMI calculation

Classification based on BMI ranges

▶️ Running the Program
Prerequisites

Java Development Kit (JDK) 8 or higher installed

Steps

Open a terminal or command prompt

Navigate to the directory containing BMICalculator.java

Compile the file:

javac BMICalculator.java


Run the program:

java BMICalculator

📝 Example Output
Enter your height in feet
5
Enter your height in inches
6
Enter your weight in lb
150
Your BMI is 24.21
You are healthy weight

📊 BMI Categories Used
BMI Range	Category
Less than 18.5	Underweight
18.5 – 24.9	Healthy weight
25 – 29.9	Overweight
30 or higher	Obese
💡 Potential Improvements

Validate user input (prevent negative values)

Add metric option (kg + cm input)

Loop the program to allow repeated use

Format BMI to 2 decimal places

Add graphical UI (Swing/JavaFX)
