# BigData_RecommendationSystem
Jiaxuan Cai's course project for BigData ---- Recommendation system based on Spark and SCALA

### Summary of the System

This is a movie recommendation system, the aim of the program is to make statistics on film ratings and evaluation information, and recommend films based on their contents and users who rate them by conducting Statistical algorithms and ALS collaborative filtering recommendation algorithm using SCALA.



### Specific functional modules include:

1. #### Hot Movie Statistics

   Count movie ratings

2. #### Statistics of popular movies every month and year

   Count the TOP50 hottest movies of each month

   Keep track of movie popularity trends

3. #### High score movies statistics

4. #### High score movies statistics by category

5. #### Movies recommendation based on movies' contents

6. #### Movies recommendation based on users' ratings to different movies

   1. The product of UserId and MovieID Cartesian

   2. Generate (uID, MID)

   3. Prediction by model (UID, MID)

   4. The predicted results are sorted by the predicted score

   5. Returns K movies with the highest score

   6. Recommendations as current users

   

### Data Source and Introduction

We use opensource data from a organization named Movielens, the  amount of data covers 160 thousand movies, 24 million ratings and 670 thousand evaluation tags.

The formats of data tables used are list below (line 1: name of table; line 2: list of properties; line 3: an example row of data):

**Movies:**

movieId, title, genres

1, Toy Story (1995), Adventure|Animation|Children|Comedy|Fantasy

**Ratings:**

userId, movieId, rating, timestamp

1, 122, 2.0, 945544824

**Tags:**

userId, movieId, tag, timestamp

28, 63062, "apple,""pear""", 945544824
