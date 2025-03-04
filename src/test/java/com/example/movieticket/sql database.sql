insert into user_details(user_id, created_at, created_by, email, is_active, phone_number, `password`, `role`, updated_at)
values
(1, '2025-03-04 00:08:47.985325', 'admin','prasad@123', 'y' , '8341472089', '1702','user', '2025-03-04 00:08:47.985325'),
(2, '2025-03-04 00:08:47.985325', 'admin','Ramya@123', 'y' , '9959502578', '0210','user', '2025-03-04 00:08:47.985325'),
(3, '2025-03-04 00:08:47.985325', 'admin','Narendra@123', 'y' , '8341472089', '99080','user', '2025-03-04 00:08:47.985325');


INSERT INTO movies (image_url, show_time, created_by, description, duration, genre, theatre_id, release_date, title, updated_at, updated_by) VALUES
('https://m.media-amazon.com/images/M/MV5BOGQ3MzA3ODItYjMyNy00YTMyLWI2OGYtMjE2M2JlNTdhOTEzXkEyXkFqcGc@._V1_.jpg', '2025-03-05 10:00:00', 'admin', 'Dear Comrade is an intense love story between Bobby (Vijay Deverakonda), a student union leader and Lily (Rashmika Mandanna) a state-level cricketer.', 132, 'Action/Drama/Romance', 1, '2025-03-05', 'Dear Comrade', '2025-03-05 10:00:00', 'admin'),
('https://assetscdn1.paytm.com/images/cinema/Majaka-Gallery-639ff0a0-bb87-11ef-b7ba-d38d54c71b9f.jpg', '2025-02-28 10:00:00', 'admin', 'The path true love does not run smoothly; father and son seek marriage at the same time.', 149, 'Romantic Comedy', 1, '2025-02-26', 'Mazaka', '2025-02-28 10:00:00', 'admin'),
('https://assetscdn1.paytm.com/images/cinema/WhatsApp%20Image%202025-02-19%20at%2020.57.49-f81423e0-eedc-11ef-bd85-99649fab9b6d.jpeg', '2025-02-14 10:00:00', 'admin', 'Ragavan, infamous for his reckless ways and academic struggles, turns to fraud after a heartbreaking breakup, chasing wealth and power.', 150, 'Romance/Comedy', 1, '2025-02-14', 'Return of Dragon', '2025-02-14 10:00:00', 'admin'),
('https://upload.wikimedia.org/wikipedia/en/thumb/c/c5/Premalu_film_poster.jpg/220px-Premalu_film_poster.jpg', '2025-02-09 10:00:00', 'admin', 'College graduate who moves to Hyderabad.', 150, 'Comedy/Romance', 1, '2025-02-08', 'Premalu', '2025-02-09 10:00:00', 'admin'),
('https://m.media-amazon.com/images/S/pv-target-images/0bfc2378464daf6d851bb86eb0b202fb73279b2748546c104c031884d4117aaa.jpg', '2025-02-07 10:00:00', 'admin', 'Feel-good romantic movie.', 149, 'Drama', 1, '2025-02-05', 'Joe', '2025-02-07 10:00:00', 'admin'),
('https://images.justwatch.com/poster/316584087/s718/manjummel-boys.jpg', '2025-02-05 10:00:00', 'admin', 'Group of friends who go on a trip to Kodaikanal and get into a dangerous situation.', 150, 'Adventure/Drama/Thriller', 1, '2025-02-01', 'Manjummel Boys', '2025-02-05 10:00:00', 'admin'),
('https://images.justwatch.com/poster/320974724/s718/vaazha.jpg', '2025-02-03 10:00:00', 'admin', 'Four friends deemed "losers" face immense pressure from parents and society upon entering adulthood.', 150, 'Coming-of-Age/Drama/Comedy', 1, '2025-02-01', 'Vaazha', '2025-02-03 10:00:00', 'admin'),
('https://static.toiimg.com/photo/msid-113734788/113734788.jpg?31084', '2025-02-01 10:00:00', 'admin', 'A coastal village chieftain who feuds with a rival over arms smuggling.', 150, 'Action/Drama/Thriller', 1, '2025-01-29', 'Devara', '2025-02-01 10:00:00', 'admin');


INSERT INTO ticketmovie.showtimes 
(showtime_id, available_seats, created_at, created_by, end_date, end_time, is_active, screen_number, start_date, start_time, updated_at, updated_by, movie_id, theatre_id) 
VALUES 
(1, 150, '2025-03-04 10:00:00.000000', 'admin', '2025-03-04', '15:30:00', 1, 6, '2025-03-04', '12:00:00', '2025-03-04 12:15:00', 'admin', 1, 1),
(2, 250, '2025-03-04 10:00:00.000000', 'admin', '2025-03-04', '15:30:00', 1, 6, '2025-03-04', '12:00:00', '2025-03-04 12:15:00', 'admin', 2,2),
(3, 100, '2025-03-04 10:00:00.000000', 'admin', '2025-03-04', '15:30:00', 1, 6, '2025-03-04', '12:00:00', '2025-03-04 12:15:00', 'admin', 3, 3);


INSERT INTO seats (seat_id, created_at, created_by, is_booked, seat_number, updated_at, updated_by, showtime_id)
VALUES
(1, '2025-03-04 00:08:47.985325', 'admin', 'Y', 'A1', '2025-03-04 00:08:47.985325', 'admin', 1),
(2, '2025-03-04 00:08:47.985325', 'admin', 'Y', 'A2', '2025-03-04 00:08:47.985325', 'admin', 1),
(3, '2025-03-04 00:08:47.985325', 'admin', 'Y', 'A3', '2025-03-04 00:08:47.985325', 'admin', 1),
(4, '2025-03-04 00:08:47.985325', 'admin', 'N', 'A4', '2025-03-04 00:08:47.985325', 'admin', 1),
(5, '2025-03-04 00:08:47.985325', 'admin', 'N', 'A5', '2025-03-04 00:08:47.985325', 'admin', 1),
(6, '2025-03-04 00:08:47.985325', 'admin', 'Y', 'B1', '2025-03-04 00:08:47.985325', 'admin', 1),
(7, '2025-03-04 00:08:47.985325', 'admin', 'N', 'B2', '2025-03-04 00:08:47.985325', 'admin', 1),
(8, '2025-03-04 00:08:47.985325', 'admin', 'Y', 'B3', '2025-03-04 00:08:47.985325', 'admin', 1),
(9, '2025-03-04 00:08:47.985325', 'admin', 'N', 'B4', '2025-03-04 00:08:47.985325', 'admin', 1),
(10, '2025-03-04 00:08:47.985325', 'admin', 'Y', 'B5', '2025-03-04 00:08:47.985325', 'admin', 1),
(11, '2025-03-04 00:08:47.985325', 'admin', 'N', 'C1', '2025-03-04 00:08:47.985325', 'admin', 1),
(12, '2025-03-04 00:08:47.985325', 'admin', 'N', 'C2', '2025-03-04 00:08:47.985325', 'admin', 1),
(13, '2025-03-04 00:08:47.985325', 'admin', 'Y', 'C3', '2025-03-04 00:08:47.985325', 'admin', 1),
(14, '2025-03-04 00:08:47.985325', 'admin', 'N', 'C4', '2025-03-04 00:08:47.985325', 'admin', 1),
...
(79, '2025-03-04 00:08:47.985325', 'admin', 'Y', 'H9', '2025-03-04 00:08:47.985325', 'admin', 1),
(80, '2025-03-04 00:08:47.985325', 'admin', 'N', 'H10', '2025-03-04 00:08:47.985325', 'admin', 1);


INSERT INTO theatres (theatre_id, capacity, created_at, created_by, is_active, location, name, updated_at, updated_by)
VALUES
(1, 150, '2025-03-03 10:00:00.000000', 'admin', 'Y', 'Downtown', 'Cinema Royale', '2025-03-03 10:00:00.000000', 'admin'),
(2, 200, '2025-03-03 16:36:28.000000', 'admin', 'Y', 'Beach Road, Visakhapatnam', 'INOX Forum Mall', '2025-03-03 16:36:28.000000', 'admin'),
(3, 150, '2025-03-03 16:36:28.000000', 'admin', 'Y', 'Madhurawada, Visakhapatnam', 'PVR Gold VMR Mall', '2025-03-03 16:36:28.000000', 'admin'),
(4, 100, '2025-03-03 16:36:28.000000', 'admin', 'Y', 'Dwaraka Nagar, Visakhapatnam', 'Sri Sai Theatre', '2025-03-03 16:36:28.000000', 'admin');

INSERT INTO payments (payment_id, amount, created_at, status, updated_at, booking_id)
VALUES
(1, 100.00, '2025-03-03 18:17:07.000000', 'completed', '2025-03-03 18:17:07.000000', 1),
(2, 150.50, '2025-03-03 18:17:07.000000', 'pending', '2025-03-03 18:17:07.000000', 2),
(3, 200.75, '2025-03-03 18:17:07.000000', 'completed', '2025-03-03 18:17:07.000000', 3),
(4, 50.00, '2025-03-03 18:17:07.000000', 'failed', '2025-03-03 18:17:07.000000', 4),
(5, 75.25, '2025-03-03 18:17:07.000000', 'completed', '2025-03-03 18:17:07.000000', 5),
(6, 200.00, '2025-03-03 18:17:07.000000', 'completed', '2025-03-03 18:17:07.000000', 6);

INSERT INTO bookings (booking_id, booking_date, total_amount, user_id, showtime_id, payment_id)
VALUES
(1, '2025-03-04', 750, 2, 1, 102),
(2, '2025-03-04', 900, 3, 2, 103),
(3, '2025-03-04', 1200, 4, 2, 104),
(4, '2025-03-04', 1500, 5, 3, 105);


