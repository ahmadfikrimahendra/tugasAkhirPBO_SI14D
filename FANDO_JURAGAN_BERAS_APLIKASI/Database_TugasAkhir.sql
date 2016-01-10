/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.5.21 : Database - db_tugasakhir
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_tugasakhir` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `db_tugasakhir`;

/*Table structure for table `tbl_beli` */

DROP TABLE IF EXISTS `tbl_beli`;

CREATE TABLE `tbl_beli` (
  `No` int(100) NOT NULL,
  `Id` int(100) NOT NULL,
  `Nama Pemasok` varchar(100) DEFAULT NULL,
  `Alamat` varchar(100) DEFAULT NULL,
  `Tanggal Transaksi` varchar(100) DEFAULT NULL,
  `Jenis Beras` varchar(100) DEFAULT NULL,
  `Jumlah Beli` int(100) DEFAULT NULL,
  `Harga` int(50) DEFAULT NULL,
  `Total` int(50) DEFAULT NULL,
  `Bayar` int(50) DEFAULT NULL,
  `Kembali` int(50) DEFAULT NULL,
  PRIMARY KEY (`No`,`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbl_beli` */

insert  into `tbl_beli`(`No`,`Id`,`Nama Pemasok`,`Alamat`,`Tanggal Transaksi`,`Jenis Beras`,`Jumlah Beli`,`Harga`,`Total`,`Bayar`,`Kembali`) values (1,1,'panggah','2mei','4/01/2016','Manggis',2,212000,424000,450000,26000),(2,2,'asd','dsa','4/01/2016','Manggis',2,212000,424000,450000,26000),(3,2,'asd','dsa','2 Jan 2016','Rojolele',2,225500,451000,470000,19000);

/*Table structure for table `tbl_jual` */

DROP TABLE IF EXISTS `tbl_jual`;

CREATE TABLE `tbl_jual` (
  `No` int(100) NOT NULL,
  `No. Pelanggan` int(100) NOT NULL,
  `Nama Toko` varchar(100) DEFAULT NULL,
  `Nama Pelanggan` varchar(100) DEFAULT NULL,
  `Tanggal Transaksi` varchar(100) DEFAULT NULL,
  `Jenis Beras` varchar(100) DEFAULT NULL,
  `Jumlah Beli` int(100) DEFAULT NULL,
  `Harga` int(100) DEFAULT NULL,
  `Total` int(100) DEFAULT NULL,
  `Bayar` int(100) DEFAULT NULL,
  `Kembali` int(100) DEFAULT NULL,
  PRIMARY KEY (`No`,`No. Pelanggan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbl_jual` */

insert  into `tbl_jual`(`No`,`No. Pelanggan`,`Nama Toko`,`Nama Pelanggan`,`Tanggal Transaksi`,`Jenis Beras`,`Jumlah Beli`,`Harga`,`Total`,`Bayar`,`Kembali`) values (1,1,'da','as','Jan 1, 2016','Pandan Wangi',2,250000,500000,500000,0);

/*Table structure for table `tbl_login` */

DROP TABLE IF EXISTS `tbl_login`;

CREATE TABLE `tbl_login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbl_login` */

insert  into `tbl_login`(`username`,`password`) values ('basing','123'),('beruang','beruang'),('galih','persib'),('galihrp','viking'),('panggah','123'),('panggah1','panggah'),('wer','asd');

/*Table structure for table `tbl_pelanggan` */

DROP TABLE IF EXISTS `tbl_pelanggan`;

CREATE TABLE `tbl_pelanggan` (
  `No` int(50) NOT NULL,
  `Nama Pelanggan` varchar(100) DEFAULT NULL,
  `Nama Toko` varchar(100) DEFAULT NULL,
  `Alamat` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`No`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbl_pelanggan` */

insert  into `tbl_pelanggan`(`No`,`Nama Pelanggan`,`Nama Toko`,`Alamat`) values (1,'as','da','asdasd'),(2,'fajar','dyas family','karang');

/*Table structure for table `tbl_pemasok` */

DROP TABLE IF EXISTS `tbl_pemasok`;

CREATE TABLE `tbl_pemasok` (
  `Id` int(50) NOT NULL,
  `Nama Pemasok` varchar(100) DEFAULT NULL,
  `Alamat` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbl_pemasok` */

insert  into `tbl_pemasok`(`Id`,`Nama Pemasok`,`Alamat`) values (1,'panggah','2mei'),(2,'asd','dsa');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
