public class Chapter1_Challenge_1_2 {
public static void main(String[] args) {
// Step 1: Initialize the array of winning numbers
String[] winningNumbers = {"12-34-56-78-90", "33-44-11-66-22",
"01-02-03-04-05"};
double highestAverage = 0;
String winningTicket = "";
// Step 2: Analyze each ticket using a for loop
for (String ticket : winningNumbers) {
System.out.println("Analyzing: " + ticket);
// Remove dashes to form one continuous string
String noDash = ticket.replace("-", "");
// Convert the string to a character array
char[] digits = noDash.toCharArray();
int[] numArray = new int[digits.length];
// Convert each character to an integer
for (int i = 0; i < digits.length; i++) {
numArray[i] = Character.getNumericValue(digits[i]);
}
// Calculate sum using a for-each loop
int sum = 0;
for (int num : numArray) {
sum += num;
}
// Calculate average
double average = (double) sum / numArray.length;
// Print analysis for this ticket
System.out.println("Digit Sum: " + sum + ", Digit Average: " +
average);
// Track the highest average and corresponding ticket
if (average > highestAverage) {
highestAverage = average;
winningTicket = ticket;
}
}
// Step 3: Announce the winning number
System.out.println("The winning number with the highest
average is: "
+ winningTicket + " with an average of " +
highestAverage);
}
}