# HotelReservationSystem
The API is built in Java Spring Boot.
Maven is used as build tool.
MySQL is used for data persistence.

API documentation:
1) Get Hotel list

`curl --location --request GET 'localhost:8081/hotel/'`

![alt text](https://github.com/A00457310/HotelReservationSystem/blob/main/get_hotels.png)

2) Create Hotel

`curl --location --request POST 'localhost:8081/hotel/' \
 --header 'Content-Type: application/json' \
 --data-raw '{
     "name": "Hotel Test 1",
     "noOfRooms": 100,
     "rating": 4.4,
     "availability": true
 }'`
 
![alt text](https://github.com/A00457310/HotelReservationSystem/blob/main/create_hotel.png)


3) Create User

`curl --location --request POST 'localhost:8081/hotel/user' \
 --header 'Content-Type: application/json' \
 --data-raw '{
     "name": "User 3",
     "email": "xyz@abc.com",
     "mobile": "+18768767001",
     "password": "Pass"
 }'`
 
![alt text](https://github.com/A00457310/HotelReservationSystem/blob/main/create_user.png)

4) Reserve Hotel Room

`curl --location --request POST 'localhost:8081/hotel/reserve' \
 --header 'Content-Type: application/json' \
 --data-raw '{
     "userId": 20,
     "hotelId": 19,
     "noOfRoomsBooked": 2,
     "checkInDate": "2022-03-12T01:08:48.470Z",
     "checkOutDate": "2022-03-18T01:08:48.470Z",
     "guests": [
         {
             "name": "ljkalkj",
             "gender": "lajlkjs",
             "email": "ljalkjalk",
             "mobile": "ljalkjaklj"
         }
     ]
 }'`
 
![alt text](https://github.com/A00457310/HotelReservationSystem/blob/main/reserve_room.png)