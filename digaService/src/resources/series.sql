CREATE TABLE `series` (
  `id` int(11) NOT NULL,
  `code` text COLLATE utf8_estonian_ci,
  `name` text COLLATE utf8_estonian_ci
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_estonian_ci;

INSERT INTO `series` (`id`, `code`, `name`) VALUES
(1, '1-4', 'Finants lepingud'),
(2, '1-8', 'Halduslepingud'),
(3, '1-9', 'Kirjavahetus ravimiametiga'),
(4, '1-10', 'Kirjavahetus hankijatega');

ALTER TABLE `series`
  ADD PRIMARY KEY (`id`);
  
  ALTER TABLE `series`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;