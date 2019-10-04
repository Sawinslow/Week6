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
-- Table structure for table `theater`
--

DROP TABLE IF EXISTS `theater`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `theater` (
  `theater_id` int(11) NOT NULL AUTO_INCREMENT,
  `theater_name` varchar(30) NOT NULL,
  PRIMARY KEY (`theater_id`)
) ENGINE=InnoDB AUTO_INCREMENT=156 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `theater`
--

LOCK TABLES `theater` WRITE;
/*!40000 ALTER TABLE `theater` DISABLE KEYS */;
INSERT INTO `theater` VALUES (1,'Place'),(2,'Place'),(3,'Place'),(4,'Place'),(5,'Place'),(6,'Place'),(7,'Place'),(8,'Place'),(9,'Place'),(10,'Place'),(11,'Place'),(12,'Place'),(13,'Place'),(14,'Place'),(15,'Place'),(16,'Place'),(17,'Place'),(18,'Place'),(19,'Place'),(20,'Place'),(21,'Place'),(22,'Place'),(23,'Place'),(24,'Place'),(25,'Place'),(26,'Place'),(27,'Place'),(28,'Place'),(29,'Place'),(30,'Place'),(31,'Place'),(32,'Place'),(33,'Place'),(34,'Place'),(35,'Place'),(36,'Place'),(37,'Place'),(38,'Place'),(39,'Place'),(40,'Place'),(41,'Place'),(42,'Place'),(43,'Place'),(44,'Place'),(45,'Place'),(46,'Place'),(47,'Place'),(48,'Place'),(49,'Place'),(50,'Place'),(51,'Place'),(52,'Place'),(53,'Place'),(54,'Place'),(55,'Place'),(56,'Place'),(57,'Place'),(58,'Place'),(59,'Place'),(60,'Place'),(61,'Place'),(62,'Place'),(63,'Place'),(64,'Place'),(65,'Place'),(66,'Place'),(67,'Place'),(68,'Place'),(69,'Place'),(70,'Place'),(71,'Place'),(72,'Place'),(73,'Place'),(74,'Place'),(75,'Place'),(76,'Place'),(77,'Place'),(78,'Place'),(79,'Place'),(80,'Place'),(81,'Place'),(82,'Place'),(83,'Place'),(84,'Place'),(85,'Place'),(86,'Place'),(87,'Place'),(88,'Place'),(89,'Place'),(90,'Place'),(91,'Place'),(92,'Place'),(93,'Place'),(94,'Place'),(95,'Place'),(96,'Place'),(97,'Place'),(98,'Place'),(99,'Place'),(100,'Place'),(101,'Place'),(102,'Place'),(103,'Place'),(104,'Place'),(105,'Place'),(106,'Place'),(107,'Place'),(108,'Place'),(109,'Place'),(110,'Place'),(111,'Place'),(112,'Place'),(149,'Place'),(150,'Place'),(151,'Place'),(152,'PlazaTester'),(153,'Places'),(154,'Places'),(155,'Places');
/*!40000 ALTER TABLE `theater` ENABLE KEYS */;
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
