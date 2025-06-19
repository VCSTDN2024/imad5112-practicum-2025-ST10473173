Tasty Music

- Developer: Anton Oliver Frankie Ngobeni
- Student Number: ST10473173
- Group: Group 2
- Course: Higher Certificate in Mobile Application and Web Development 
- Subject: Introduction to Mobile Application Development 
 
 Links

- GitHub Repository Link: https://github.com/VCSTDN2024/imad5112-practicum-2025-ST10473173.git 


Project Overview

The “Tasty Music” is a kotlin-based Android application designed for . The app has two screens: The Welcome screen that the user will see when they open the app, the user will then see a start button which will take them to the second screen. After that the user can look for the songs they want and also calculate the average . The user will also have a back button which will take them back to the main activity.

Purpose and Features

Purpose

The purpose of this app is to help people  

Key Features 

- Multiple activity navigation
- App exit functionality
- Display songs information
- Back to Main screen functionality
- Reset functionality
- Calculates Rating


Design Considerations


1.User Interface Design

- Simplicity and Clarity: The app features a clean and minimalistic interface with clearly labeled buttons for starting the Music selection, displaying songs title, artist name, rating, comments and exiting the app. Each activity is focused on a single purpose: starting the app, displaying songs, or adding to a playlist which reduces cognitive load and makes navigation intuitive for users. Button that is clicked calculates and displays the average rating for the songs in the playlist. Button that when clicked displays the list of songs with the corresponding details using a loop. 

2.User Experience Design

- Instant Feedback: The music app provides immediate feedback after each answer using Toast messages, informing users whether their song title exists before allowing them to display. To help users get information about a specific song without going through too much process. 

3.Technical Design

- Error Handling: The app includes basic error handling to ensure smooth interaction. For instance, in SecondActivity, if the user tries to proceed without entering a song title, a Toast message prompts them to do so, preventing crashes and enforcing required input. Additionally, the use of safe null-handling techniques like Kotlin’s Elvis operator (?:) and default values ensures the app behaves reliably even if some intent data is missing.

4.Logo and Theme

-App name: Short and catchy name 


GitHub and GitHub Actions

This project was managed using “GitHub” for version control, where all code changes were committed.

I utilized Git-ub Actions to automate the build and deployment process. This includes:

• Running automated tests to ensure the app's functionality.

• Compiling the app into “APK” and “AAB” files, which are the formats required for distribution.

• Uploading these build artifacts to GitHub for easy access.


The workflow ensures that my project is automatically built and tested every time I push changes, and it simplifies the process of delivering the final APK/AAB files for submission

Screenshots

What the user will see when the start up the app: 

Step 1: Press Start to move to the second screen.

Step 2: Press Exit to exit the app.



Figure. 1.Main Screen





Second screen after they press start:

Step 1: First you will enter the Song Title.

Step 2: You will press the Display button.

Step 3: A list of songs will appear in the textBox.
Step 4: you can choose to add it to playlist.
Step 5: you can return to the main screen.
Step 6: You can use the reset button to clear the information.


Figure. 2. Second Screen





The display button will show you all the songs you can choose from:
Step 1: Users can press “Display song” to see the songs available.
Step 2: user can input the song title in the edit text to add to playlist.


Figure. 3.Display Songs









When you insert a song Then press average rating, the app will calculate the rating for you:

Step 1: User can enter song title in edit text
Step 2: User can the press average rating to receive rating of the song 

Figure. 4.Average rating






 The full detail button will show full details of song , rating and comments:

Step 1: user can press full detail to get all information about the songs

Figure. 5. Full details Button 




The add to playlist button adds songs to the playlist based on what song title the user has entered:

Step 1: First enter title of song 
Step 2: the press the button to add to playlist

Figure. 6.Add to playlist

Challenges and Learnings 

1.UI and UX Design

-Challenge: Making the interface intuitive yet engaging

-Solution: Previous apps and notes done in class helped me face this challenge

2.UI elements

-Challenges: UI elements were not aligning to the the screen size

-Solution: I did a test on multiple screen sizes and the layout, I ended up choosing the constraint layout.

3.Adding unnecessary buttons and textviews

-Challenges: Overcomplicating features 

-Solution: Sticking to what the project is asking and not what I'm asking for.


“I learnt that every bug you solve makes the app better than before, and I also need to be patient and ask for help when needed.”

Future Enhancements

Future Upgrades -  I would make the app to have more information and allow people to choose what genre they want. To make it more fun to use, I will make a speech to text function where people can sing to the app if they don't know the song title, the app will then pick up the speech and find the song for you.

References 

Link: W3schools.com (no date) W3Schools Online Web Tutorials. Available at: https://www.w3schools.com/kotlin/kotlin_functions.php (Accessed: 19 June 2025). 

Link: Learn Kotlin from scratch (no date) Coding Blocks Online. Available at: https://online.codingblocks.com/courses/kotlin-basics (Accessed: 19 June 2025).

Link:IMAD5112_MM.docx 

List Of Figures

Figure 1: Main Screen
Figure 2: Second Screen
Figure 3: Display songs
Figure 4: Average rating 
Figure 5: Full Details button
Figure 6: Add to playlist

