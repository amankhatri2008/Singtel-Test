# SingtelTest

## A Answers
### 1.B ==>We can create a new Interface class "Speak" with method callSound()  and implement this interface in  Bird Class default method will output "I am Singing"


### 2.A ==>We will  implement Speak interface in  DUCK class and overide the callSound() method with sound type ENUM DUCK("Quack, quack")
### 2.B ==>We will  implement SWIM interface in DUCK class, SWIM interface will have default method "I can Swim"
### 2.C ==>We will  implement Speak interface in CHICKEN class, and overide the callSound() method with sound type ENUM CHICKEN("Cluck, cluck")
### 2.D ==>We will  implement FLY interface in CHICKEN class, and overide the fly() method with output as  "I can not Fly".

### 3.A ==>We will extend CHICKEN class in ROOSTER class and override callSound() method(which is there because CHICKEN Class inherts from Bird Class) with sound type ENUM ROOSTER("Cock-a-doodle-doo")
### 3.C ==>We can implement related interfaces like FLY, SPEACK ,WALK , SWIM etc instead of extending CHICKEN class

 
### 4.A,B,C ==>We can have two constructor for PARROT class , default one will inhert default sound from BIRD Class and the other one will have SoundHelper class where we can pass sound type DOG, CAT or ROOSTER
### 4.D ==>We need to append SoundType Enum and use it in SoundHelper class.


## B Answers
### 1.A,B,C  ==> We can implement SWIM Interface in Fish Class.

### 2.A,B,C,D ==> We can have BodyType interface with method bodyType and bodyColor and implement this interface in Class FISH and extend class Fish in Class SHARK and CLOWNFISH and we can overide methods as mentioned.
 
## D Answers

### NOT DONE YET


## E Answers

### Completed

## BONUS

###1 NOT DONE
###2 COMPLETED
