USE CSE_4A_221;

------------- PART - A ----------------

-- 1. Retrieve a unique genre of songs. 

SELECT DISTINCT GENRE
FROM SONGS;

-- 2. Find top 2 albums released before 2010. 

SELECT TOP 2
    *
FROM ALBUMS
WHERE RELEASE_YEAR < 2010;

-- 3. Insert Data into the Songs Table. (1245, ‘Zaroor’, 2.55, ‘Feel good’, 1005) 

INSERT INTO SONGS
VALUES
    (1245, 'ZAROOR', 2.55, 'FEEL GOOD', 1005);

-- 4. Change the Genre of the song ‘Zaroor’ to ‘Happy’ 

UPDATE SONGS SET GENRE = 'HAPPY' WHERE SONG_TITLE = 'ZAROOR';

-- 5. Delete an Artist ‘Ed Sheeran’ 

DELETE FROM ARTISTS WHERE ARTIST_NAME = 'ED SHEERAN';

-- 6. Add a New Column for Rating in Songs Table. [Ratings decimal(3,2)] 

ALTER TABLE SONGS ADD RATING DECIMAL(3,2);

SELECT *
FROM SONGS;

-- 7. Retrieve songs whose title starts with 'S'. 

SELECT SONG_TITLE
FROM SONGS
WHERE SONG_TITLE LIKE 'S%';

-- 8. Retrieve all songs whose title contains 'Everybody'. 

SELECT SONG_TITLE
FROM SONGS
WHERE SONG_TITLE LIKE '%EVERYBODY%';


-- 9. Display Artist Name in Uppercase. 

SELECT UPPER(ARTIST_NAME)
FROM ARTISTS;

-- 10. Find the Square Root of the Duration of a Song ‘Good Luck’ 

SELECT SQRT(DURATION)
FROM SONGS
WHERE SONG_TITLE = 'GOOD LUCK';

-- 11. Find Current Date. 

SELECT GETDATE()
;

-- 12. Find the number of albums for each artist. 

SELECT ARTISTS.ARTIST_NAME, COUNT(*) AS SONG_COUNT
FROM ARTISTS JOIN ALBUMS ON ARTISTS.ARTIST_ID = ALBUMS.ARTIST_ID
GROUP BY ARTISTS.ARTIST_NAME;

-- 13. Retrieve the Album_id which has more than 5 songs in it. 

SELECT A.ALBUM_ID, COUNT(S.SONG_ID)
FROM ALBUMS A JOIN SONGS S ON A.ALBUM_ID = S.ALBUM_ID
GROUP BY A.ALBUM_ID
HAVING COUNT(S.SONG_ID) > 5;

-- 14. Retrieve all songs from the album 'Album1'. (using Subquery) 

SELECT SONG_TITLE
FROM SONGS
WHERE ALBUM_ID = (SELECT ALBUM_ID
FROM ALBUMS
WHERE ALBUM_TITLE = 'ALBUM1');

-- 15. Retrieve all albums name from the artist ‘Aparshakti Khurana’ (using Subquery) 

SELECT ALBUM_TITLE
FROM ALBUMS
WHERE ARTIST_ID = (SELECT ARTIST_ID
FROM ARTISTS
WHERE ARTIST_NAME = 'APARSHAKTI KHURANA');

-- 16. Retrieve all the song titles with its album title. 

SELECT S.SONG_TITLE, A.ALBUM_TITLE
FROM SONGS S JOIN ALBUMS A ON S.ALBUM_ID = A.ALBUM_ID;

-- 17. Find all the songs which are released in 2020. 

SELECT *
FROM SONGS S JOIN ALBUMS A ON S.ALBUM_ID = A.ALBUM_ID
WHERE A.RELEASE_YEAR = 2020;

-- 18. Create a view called ‘Fav_Songs’ from the songs table having songs with song_id 101-105.  

CREATE VIEW FAV_SONGS
AS
    SELECT *
    FROM SONGS
    WHERE SONG_ID BETWEEN 101 AND 105;

-- 19. Update a song name to ‘Jannat’ of song having song_id 101 in Fav_Songs view. 

UPDATE FAV_SONGS
SET SONG_TITLE = 'JANNAT'
WHERE SONG_ID = 101;

-- 20. Find all artists who have released an album in 2020. 

SELECT *
FROM ARTISTS A JOIN ALBUMS B ON A.ARTIST_ID = B.ARTIST_ID
WHERE B.RELEASE_YEAR = 2020;

-- 21. Retrieve all songs by Shreya Ghoshal and order them by duration.  

SELECT *
FROM SONGS S
    JOIN ALBUMS A ON S.ALBUM_ID = A.ALBUM_ID
    JOIN ARTISTS B ON A.ARTIST_ID = B.ARTIST_ID
WHERE B.ARTIST_NAME = 'SHREYA GHOSAL';


------------- PART - B ----------------

-- 22. Retrieve all song titles by artists who have more than one album.  

SELECT B.ARTIST_NAME, S.SONG_TITLE
FROM SONGS S
    JOIN ALBUMS A ON S.ALBUM_ID = A.ALBUM_ID
    JOIN ARTISTS B ON A.ARTIST_ID = B.ARTIST_ID
WHERE B.ARTIST_ID IN (
    SELECT B.ARTIST_ID
FROM ALBUMS B
GROUP BY B.ARTIST_ID
HAVING COUNT(B.ALBUM_ID) > 1
)

-- 23. Retrieve all albums along with the total number of songs.  

SELECT A.ALBUM_TITLE, COUNT(S.SONG_ID)
FROM ALBUMS A JOIN SONGS S ON A.ALBUM_ID = S.ALBUM_ID
GROUP BY A.ALBUM_TITLE;

-- 24. Retrieve all songs and release year and sort them by release year.  

SELECT S.*, A.RELEASE_YEAR
FROM SONGS S JOIN ALBUMS A ON S.ALBUM_ID = A.ALBUM_ID
ORDER BY A.RELEASE_YEAR;

-- 25. Retrieve the total number of songs for each genre, showing genres that have more than 2 songs. 

SELECT GENRE, COUNT(SONG_ID)
FROM SONGS
GROUP BY GENRE
HAVING COUNT(SONG_ID) > 2;

-- 26. List all artists who have albums that contain more than 3 songs.

SELECT DISTINCT A.ARTIST_NAME
FROM ARTISTS A JOIN ALBUMS B ON A.ARTIST_ID = B.ARTIST_ID JOIN SONGS S ON B.ALBUM_ID = S.ALBUM_ID
WHERE B.ALBUM_ID IN (
    SELECT ALBUM_ID
FROM SONGS
GROUP BY ALBUM_ID
HAVING COUNT(SONG_ID)>3
)


------------- PART - C ----------------

-- 27. Retrieve albums that have been released in the same year as 'Album4' 

SELECT ALBUM_TITLE
FROM ALBUMS
WHERE RELEASE_YEAR = (SELECT RELEASE_YEAR
FROM ALBUMS
WHERE ALBUM_TITLE = 'ALBUM4');

-- 28. Find the longest song in each genre 

SELECT GENRE, MAX(DURATION)
FROM SONGS
GROUP BY GENRE;

-- 29. Retrieve the titles of songs released in albums that contain the word 'Album' in the title. 

SELECT S.SONG_TITLE, A.ALBUM_TITLE
FROM SONGS S JOIN ALBUMS A ON S.ALBUM_ID = A.ALBUM_ID
WHERE A.ALBUM_TITLE LIKE '%ALBUM%';

-- 30. Retrieve the total duration of songs by each artist where total duration exceeds 15 minutes. 

SELECT A.ARTIST_NAME, SUM(S.DURATION)
FROM ARTISTS A
    JOIN ALBUMS B ON A.ARTIST_ID = B.ARTIST_ID
    JOIN SONGS S ON B.ALBUM_ID = S.ALBUM_ID
GROUP BY A.ARTIST_NAME;

