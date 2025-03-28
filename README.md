# When to Stop?

Represented in this repository is one of my favorite math problems: the secretary problem. Essentially, you are tasked with interviewing 100 secretaries and after each secretary leaves, you must offer them the job or deny them the job, on the spot. The natural approach is to interview a sample of them at the beginning to "test the playing field", then find the next best person after that. This is often called a look-then-leap algorithm. The question is, however, how many people you should interview as part of that initial surveying phase. 

If you decide to get a feel for the applicant pool using just the first person (and then hire the next best person after them), chances are you'll hire a subpar applicant and miss the opportunity to find the best. In fact, unless that first person happened to be the second-best applicant, you will fail at finding the best applicant. You are choosing someone when you have barely any information on how they compare to the rest of the applicants. 

However, if you decide on an initial surveying phase of 99 applicants, you will have plenty of information to decide the best applicant, but no agency, as you will be forced to hire the 100th person, no matter their skill level.

This simulation generates an applicant pool array using the user's input where each entry is a randomly generated "skill level" between 0 and 100. It then runs a number of simulations applying the look-then-leap algorithm on different random applicant pools for each percent between 1 and 100. Finally, it reports the average of the percent of times it successfully found the best applicant (the array entry 1) for each simulation and each percent.

As it turns out, the optimal stopping point is roughly 37% (1/e to be exact) and using this percent, the simulation finds the best applicant approximately 37% (again, 1/e to be exact) of the time. This is one of the most fascinating symmetries that show up in math and computer science. 

An example of the data output from the simulation is shown below, with the x-axis representing the percent of applicants surveyed, and the y axis representing the success rate. 

<img src="graph.png">

And this is what the simulation will look like when run in a shell:

<img src="code.png">
