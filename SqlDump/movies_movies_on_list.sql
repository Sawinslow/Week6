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
-- Table structure for table `movies_on_list`
--

DROP TABLE IF EXISTS `movies_on_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movies_on_list` (
  `movie_id` int(11) NOT NULL,
  `ID` int(11) NOT NULL,
  KEY `ID` (`ID`),
  KEY `movie_id` (`movie_id`),
  CONSTRAINT `movies_on_list_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `list_theater` (`List_ID`),
  CONSTRAINT `movies_on_list_ibfk_2` FOREIGN KEY (`movie_id`) REFERENCES `movie` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movies_on_list`
--

LOCK TABLES `movies_on_list` WRITE;
/*!40000 ALTER TABLE `movies_on_list` DISABLE KEYS */;
INSERT INTO `movies_on_list` VALUES (39,8),(38,8),(45,11),(44,11),(89,33),(88,33),(91,34),(90,34),(93,35),(92,35),(95,36),(94,36),(97,37),(96,37),(99,38),(98,38),(101,39),(100,39),(113,45),(112,45),(177,77),(176,77),(191,84),(190,84),(193,85),(192,85),(195,86),(194,86),(197,87),(196,87),(199,88),(198,88),(201,89),(200,89),(202,90),(203,90),(204,91),(205,91),(206,98),(207,98),(208,99),(209,99),(210,100),(211,100),(1,101),(2,101),(2,11);
/*!40000 ALTER TABLE `movies_on_list` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-03 19:31:35
