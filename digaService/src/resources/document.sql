
	CREATE TABLE `document` (
	  `id` int(11) NOT NULL,
	  `name` text COLLATE utf8_estonian_ci,
	  `mark` text COLLATE utf8_estonian_ci,
	  `year` int(11) DEFAULT NULL,
	  `exitYear` text COLLATE utf8_estonian_ci,
	  `intakeAct` text COLLATE utf8_estonian_ci,
	  `destructionAct` text COLLATE utf8_estonian_ci,
	  `containerCode` text COLLATE utf8_estonian_ci,
	  `documentCode` text COLLATE utf8_estonian_ci,
	  `placeCode` text COLLATE utf8_estonian_ci,
	  `description` text COLLATE utf8_estonian_ci,
	  `companyId` int(11) NOT NULL,
	  `seriesId` int(11) NOT NULL
	) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_estonian_ci;


ALTER TABLE `document`
  ADD PRIMARY KEY (`id`);


ALTER TABLE `document`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
