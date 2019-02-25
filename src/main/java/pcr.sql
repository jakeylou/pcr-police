CREATE TABLE `boss` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `hp` bigint(20) DEFAULT NULL,
  `turn` int(2) NOT NULL,
  `time` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8;

CREATE TABLE `member` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userId` varchar(255) NOT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `count` int(1) NOT NULL,
  `attack` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8;