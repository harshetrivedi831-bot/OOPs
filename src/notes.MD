inheritance supported by java : means re use existing functionality 
these way :
single inheritance : single child will have single parent 
ex : savingAccount extends Account class

multilevel inheritanc : form chain means 
on parent will have child and that child beocmes a parent on next child
Account extends SavingAccount extends PensionAccount

hierarchial inheritance :
multiple child have one parent

SavingAccount extends Account 
JanDhanAccount extends Account 
PensionAccount extends Account 

multiple inheritance :
in java it will lead to ambigurty.
how actually in real world multiple child can have one parent, 
vice cers is not possible.
SavingAccount extends Account 
JanDhanAccount extends Account 
PensionAccount extends Account 

							Account(have a/c method)
							both parent have ovrridden method
SavingAccount(Account creation method)   	JanDhanAccount (Account creation method) 
					SavingAccount--PensionAccount--jandhanAccount
					now here pensioAccount object will get confsed which 
					version of account creation funvtionality i should
					go for that is death of diamond feature.

					
					
Advantage of Inheritance is there in OOps :
1. COde re - usability ( in the system if somewhere emailNotification funtionality already implemented : re use it why ? that functionlaity is 
up and running and customer built trust so it saves time b/s it is 
already tested ,but inheitance comes with a cost as well)

Disadvantage :

1. heavy loading 
2. tight coupling 

Account class
	|
SavingAccount class
	|
PremiumAccount class 
	|
SeniorCitizenAccount
	|
JanDhan Account
~ all child are type of account ( is a relation ) valid 

so what heavy laoding says : moment jvm load child class , on system child object got created so jvm load all of it parent , in our case jandhan account got 5 class inclcuding object so from object till jandhanAccount class got loaded first then the work i want to perform with janDhan account will happen.........time and memory consuming.


second thing all child are completely dependent on parent so if tomowrro requiremnt comes ok opon account creation user should get a whatsapp message as well so chnages will happen in Account class functionality, as its child were re using account creation then they will be affecting although savingaccount dont need any whatsapp message feature still i need to implement so that i tighly couples : any chnages in parent functionality will direct affects it child.

1. heavy loading, 
-- when jvm loads child class 

---------------------------------------------
JavaPractice/
└── src/
    └── com.harsh/
        ├── basics/
        │   ├── array/
        │   ├── loops/
        │   └── controlflow/
        ├── oops/
        │   ├── bank/
        │   ├── inheritance/
        │   ├── restaurant/
        │   └── vehiclecompany/
        ├── strings/
        ├── collections/
        ├── exceptionhandling/
        └── revision/