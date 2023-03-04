# Backend Project in Full Stack Web Development

### Technology Stack:

Springboot , RESTFul API , Mysql Database(SQL) , Postman , Github  <br/>



### Note:<br/>
Create, Read, Update, and Delete (CRUD) correlates to the HTTP protocol’s POST, GET, PUT, and DELETE, which REST is built on top of. Having an understanding of the relationship between CRUD, REST and HTTP creates a solid foundation about how to use web services and APIs better.

Here is the overview of project directory:<br/>
----------------------------------------------------------------------------------------------------------------------------------
<img width="359" alt="Screenshot 2023-03-03 at 9 40 10 PM" src="https://user-images.githubusercontent.com/99050861/222871782-cb6eefa0-90c5-4e5a-bfd1-c3a7b417eb5d.png">

Here is the results of CRUD operations using Postman:
----------------------------------------------------------------------------------------------------------------------------------
#### Process for POST Operation:<br/>

Open the Postman and do the following:

1.Select the POST <br/>
2.Invoke the URL http://localhost:8080/add.</br>
3.Select the Body <br/>
4.Select the Content-Type JSON (application/json).<br/>
5.Write the required entity values <br/>

<img width="867" alt="Screenshot 2023-03-03 at 9 45 21 PM" src="https://user-images.githubusercontent.com/99050861/222872177-a80b82b8-a786-4532-ba59-83f7eb401f57.png">

#### Process for Get Operation: (ALL)<br/>
----------------------------------------------------------------------------------------------------------------------------------
Open the Postman and do the following:

1.Select the GET <br/>
2.Invoke the URL http://localhost:8080/getAll.</br>
3. It will display all the values 

<img width="824" alt="Screenshot 2023-03-03 at 9 45 41 PM" src="https://user-images.githubusercontent.com/99050861/222872270-092f756d-4ad1-4e2a-a6f7-13a0308ffe15.png">

#### Process for Get Operation: (BY ID)<br/>
----------------------------------------------------------------------------------------------------------------------------------
Open the Postman and do the following:

1.Select the GET <br/>
2.Invoke the URL http://localhost:8080/4.</br>
3. It will display all the values based on id

<img width="820" alt="Screenshot 2023-03-03 at 9 46 20 PM" src="https://user-images.githubusercontent.com/99050861/222872189-8b25c0bd-6731-4e2d-8432-1aca35c50155.png">

#### Process for PUT Operation: <br/>
----------------------------------------------------------------------------------------------------------------------------------
Open the Postman and do the following:

1.Select the PUT <br/>
2.Invoke the URL http://localhost:8080/4.</br>
3.Select the Body <br/>
4.Select the Content-Type JSON (application/json).<br/>
5.Write the updated entity values <br/>



<img width="826" alt="Screenshot 2023-03-03 at 9 46 34 PM" src="https://user-images.githubusercontent.com/99050861/222872197-271b9707-fb52-4f5a-8eb3-fc304e939f7b.png">

#### Process for Delete Operation:(BY ID)<br/>
----------------------------------------------------------------------------------------------------------------------------------
Open the Postman and do the following:

1.Select the Delete <br/>
2.Invoke the URL http://localhost:8080/5.</br>
3. It will delete the value based on id

<img width="827" alt="Screenshot 2023-03-03 at 9 46 44 PM" src="https://user-images.githubusercontent.com/99050861/222872209-e1a28490-c1a8-4d39-bb74-5d7e2b65b528.png">

#### Used the SQL queries to perform CRUD operations on  MySQL database<br/>
----------------------------------------------------------------------------------------------------------------------------------
<img width="755" alt="Screenshot 2023-03-03 at 10 21 44 PM" src="https://user-images.githubusercontent.com/99050861/222873495-99ba2475-75fd-4e96-95e0-2d85d43d3e2f.png">
<img width="617" alt="Screenshot 2023-03-03 at 10 22 28 PM" src="https://user-images.githubusercontent.com/99050861/222873499-1c5a1dd0-775f-4470-ad4e-fd330e4d9564.png">


