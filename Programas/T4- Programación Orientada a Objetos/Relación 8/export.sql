-- --------------------------------------------------------
-- Host:                         192.168.60.130
-- Versión del servidor:         10.1.26-MariaDB-0+deb9u1 - Debian 9.1
-- SO del servidor:              debian-linux-gnu
-- HeidiSQL Versión:             10.1.0.5464
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para musica
DROP DATABASE IF EXISTS `musica`;
CREATE DATABASE IF NOT EXISTS `musica` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `musica`;

-- Volcando estructura para tabla musica.artistas
DROP TABLE IF EXISTS `artistas`;
CREATE TABLE IF NOT EXISTS `artistas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla musica.canciones
DROP TABLE IF EXISTS `canciones`;
CREATE TABLE IF NOT EXISTS `canciones` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ruta` varchar(255) NOT NULL DEFAULT '0',
  `titulo` varchar(100) NOT NULL DEFAULT '0',
  `idArtista` int(11) NOT NULL DEFAULT '0',
  `idEstilo` int(11) NOT NULL DEFAULT '0',
  `anno` int(11) NOT NULL DEFAULT '0',
  `estrellas` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `FK_canciones_artistas` (`idArtista`),
  KEY `FK_canciones_estilos` (`idEstilo`),
  CONSTRAINT `FK_canciones_artistas` FOREIGN KEY (`idArtista`) REFERENCES `artistas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_canciones_estilos` FOREIGN KEY (`idEstilo`) REFERENCES `estilos` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- La exportación de datos fue deseleccionada.
-- Volcando estructura para tabla musica.estilos
DROP TABLE IF EXISTS `estilos`;
CREATE TABLE IF NOT EXISTS `estilos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- La exportación de datos fue deseleccionada.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
