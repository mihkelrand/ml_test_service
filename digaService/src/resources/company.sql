
CREATE TABLE `company` (
  `id` int(11) NOT NULL,
  `code` int(11),
  `name` text COLLATE utf8_estonian_ci
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_estonian_ci;


INSERT INTO `company` (`id`, `code`, `name`) VALUES
(1, '101', 'Kool OÜ'),
(2, '102', 'Aabitsa AS');


ALTER TABLE `company`
  ADD PRIMARY KEY (`id`);

  
ALTER TABLE `company`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
