
create database cloud20;
use cloud20;


DROP TABLE IF EXISTS `payment`;
​
CREATE TABLE `payment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `serial` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
​
/*Data for the table `payment` */
​
insert  into `payment`(`id`,`serial`) values (1,'100'),(2,'200'),(3,'300'),(4,'400');