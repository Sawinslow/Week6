-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: movies
-- ------------------------------------------------------
-- Server version	8.0.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `movie`
--

DROP TABLE IF EXISTS `movie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movie` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `MOVIE` varchar(40) NOT NULL,
  `RAITING` int(11) NOT NULL,
  `MAINCHARACTER` varchar(40) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=212 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie`
--

LOCK TABLES `movie` WRITE;
/*!40000 ALTER TABLE `movie` DISABLE KEYS */;
INSERT INTO `movie` VALUES (1,'Spider-Man: Far From Home',8,'Peter Parker'),(2,'Captain Marvel',7,'Carol Danvers'),(3,'Avengers: Endgame',8,'Tony Stark'),(4,'The Lion King',7,'Simba'),(5,'Aladdin',7,'Aladdin'),(38,'Game',7,'Thing'),(39,'Show',7,'Thing'),(44,'Game',7,'Thing'),(45,'Show',7,'Thing'),(88,'Game',7,'Thing'),(89,'Show',7,'Thing'),(90,'Game',7,'Thing'),(91,'Show',7,'Thing'),(92,'Game',7,'Thing'),(93,'Show',7,'Thing'),(94,'Game',7,'Thing'),(95,'Show',7,'Thing'),(96,'Game',7,'Thing'),(97,'Show',7,'Thing'),(98,'Game',7,'Thing'),(99,'Show',7,'Thing'),(100,'Game',7,'Thing'),(101,'Show',7,'Thing'),(112,'Game',7,'Thing'),(113,'Show',7,'Thing'),(176,'Game',7,'Thing'),(177,'Show',7,'Thing'),(190,'Game',7,'Thing'),(191,'Show',7,'Thing'),(192,'Game',7,'Thing'),(193,'Show',7,'Thing'),(194,'Game',7,'Thing'),(195,'Show',7,'Thing'),(196,'Game',7,'Thing'),(197,'Show',7,'Thing'),(198,'Game',7,'Thing'),(199,'Show',7,'Thing'),(200,'Game',7,'Thing'),(201,'Show',7,'Thing'),(202,'Show',7,'Thing'),(203,'Game',7,'Thing'),(204,'Show',7,'Thing'),(205,'Game',7,'Thing'),(206,'Avengers',4,'Iron Man'),(207,'Captin America',7,'America'),(208,'Avengers',4,'Iron Man'),(209,'Captin America',7,'America'),(210,'Avengers',4,'Iron Man'),(211,'Captin America',7,'America');
/*!40000 ALTER TABLE `movie` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-03 19:31:34
