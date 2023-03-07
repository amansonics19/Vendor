# VENDOR Assignment For EasyOps


#PLEASE USE POSTMAN FOR VERIFICATION
Here are the urls -

GET - http://localhost:8080/wallet

POST - http://localhost:8080/wallet
              #Use JSON format for input

PUT - http://localhost:8080/wallet/"/{id}"

DELETE - http://localhost:8080/wallet/"/{id}"


All the functional requirements are implemented here - 
1. The vendor table should store the following attributes of the vendor:
1. Vendor Id - unique identifier for the vendor generated at time of create, and
should be immutable.
2. Vendor Name
3. Vendor Code - a unique code to identify the vendor. The code should be
unique across all the vendors
4. address
5. city
6. state
7. pincode - Should be 6 digit number
8. phone - 10 digit number
9. email address - valid email address
