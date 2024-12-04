# springboot_miniproject
# add etudiant method 
url : localhost:8100/student/add
query : {
    "numE" : 21215212351
    "nom" : "Chikh salah",
    "prenom" : "Ahmed",
    "moyS1" : 16.22,
    "moyS2" : 16.73,
    "moyS3" : 16.00,
    "moyS4" : 16.45
    }

# update etudiant method 
url : localhost:8100/student/2121...../update
query : {
    "nom" : "Chikh salah",
    "prenom" : "Ahmed",
    "moyS1" : 16.22,
    "moyS2" : 16.73,
    "moyS3" : 16.00,
    "moyS4" : 16.45
}
you can't change the id , provide the fields you want to update only

# delete etudiant method 
url : localhost:8100/student/2121.../delete

# get all students
url : localhost:8100/student/all

# get all students sorted by moyenne general
url : localhost:8100/student/allSorted

# search by a keyword
url : localhost:8100/student/search?keyword=...

# get a student
url localhost:8100/student/id
you pass the id directly

# add a speciality
url : localhost:8100/speciality/add
query : {
"nomSpec" : "...",
"nbrPlaces" : 82
}
# update a speciality
url : localhost:8100/speciality/1/update
query : {

}
provide the fields you want to update , not the id

# delete a speciality
url : localhost:8100/speciality/1/delete

# get a speciality
url : localhost:8100/speciality/1

# get all specialities
url : localhost:8100/speciality/all

# search speciality
url : localhost:8100/speciality/search?keyword=...

# add all choices for a student
url : localhost:8100/choice/addAll
query : [
{
"numE" : 212135841251,
"numSpec" : 1,
"ordreChoix" : 2
},
{
...
}
]
you should pass a list like this


# get all students with orientation
url : localhost:8100/student/allOrientation

# update all choices for a student
url : localhost:8100/choice/updateAll
 query : [
{
"numE" : 212135841251,
"numSpec" : 1,
"ordreChoix" : 2
},
{
...
}
]
you should pass a list like this with your changes

# delete all choices for a student 
url : localhost:8100/choice/deleteAll
query : 
{
"numE" : 212135841251,
"numSpec" : 1
},
{
...
}
]
you should pass a list like this (without order of choix)
