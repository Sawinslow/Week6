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
-- Table structure for table `list_theater`
--

DROP TABLE IF EXISTS `list_theater`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `list_theater` (
  `List_ID` int(11) NOT NULL AUTO_INCREMENT,
  `LIST_NAME` varchar(30) DEFAULT NULL,
  `TRIP_DATE` date DEFAULT NULL,
  `theater_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`List_ID`),
  KEY `theater_id` (`theater_id`),
  CONSTRAINT `list_theater_ibfk_1` FOREIGN KEY (`theater_id`) REFERENCES `theater` (`theater_id`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `list_theater`
--

LOCK TABLES `list_theater` WRITE;
/*!40000 ALTER TABLE `list_theater` DISABLE KEYS */;
INSERT INTO `list_theater` VALUES (8,'Plaza Theater','2019-09-29',19),(11,'Places','2019-07-29',155),(33,'Plaza Theater','2019-09-30',46),(34,'Plaza Theater','2019-09-30',47),(35,'Plaza Theater','2019-09-30',48),(36,'Plaza Theater','2019-09-30',49),(37,'Plaza Theater','2019-09-30',50),(38,'Plaza Theater','2019-09-30',51),(39,'Plaza Theater','2019-09-30',52),(45,'Plaza Theater','2019-09-30',58),(77,'Plaza Theater','2019-10-01',91),(84,'Plaza Theater','2019-10-01',98),(85,'Plaza Theater','2019-10-01',99),(86,'Plaza Theater','2019-10-01',100),(87,'Plaza Theater','2019-10-01',101),(88,'Plaza Theater','2019-10-01',102),(89,'Plaza Theater','2019-10-01',103),(90,'Plaza Theater','2019-10-01',104),(91,'Plaza Theater','2019-10-02',105),(92,'Testing List','2019-10-02',106),(93,'Testing List','2019-10-02',107),(94,'Testing List','2019-10-02',108),(95,'Testing List','2019-10-02',110),(96,'Testing List','2019-10-02',111),(97,'Testing List','2019-10-02',112),(98,'Testing List','2019-10-02',149),(99,'Testing List','2019-10-02',150),(100,'Testing List','2019-10-03',151),(101,'PlazaTester','2000-05-07',152);
/*!40000 ALTER TABLE `list_theater` ENABLE KEYS */;
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
