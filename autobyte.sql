-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-01-2024 a las 11:13:22
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `autobyte`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `almacen`
--

CREATE TABLE `almacen` (
  `idproducto` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `marca` varchar(45) NOT NULL,
  `stock` int(11) NOT NULL,
  `costo` float NOT NULL,
  `type` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `almacen`
--

INSERT INTO `almacen` (`idproducto`, `nombre`, `marca`, `stock`, `costo`, `type`) VALUES
(9004, 'March', 'Nissan', 19, 200000, 0),
(9005, 'Versa', 'Nissan', 44, 400000, 0),
(9008, 'Neumaticos', 'Tornel', 100, 500, 1),
(9009, 'Escapes', '', 27, 800, 1),
(9010, 'Frenos Traseros', '', 30, 500, 1),
(9012, 'NP300', 'Nissan', 20, 440000, 0),
(9013, 'Rio', 'Kia', 20, 350000, 0),
(9014, 'Aveo', 'Chevrolet', 15, 280000, 0),
(9015, 'Sentra', 'Nissan', 22, 390000, 0),
(9016, 'MG5', 'MG', 10, 298000, 0),
(9017, 'Mazda3', 'Mazda', 14, 400000, 0),
(9018, 'Mazda2', 'Mazda', 17, 290000, 0),
(9019, 'Seltos', 'Kia', 24, 450000, 0),
(9020, 'Lamborghini', 'Lamborghini', 8, 800000, 0),
(9021, 'Camaro', 'Chevrolet', 5, 1342000, 0),
(9022, 'Corvette', 'Chevrolet', 4, 2873000, 0),
(9023, 'Huayra', 'Pagani', 3, 133000000, 0),
(9024, 'Faros', '', 50, 3000, 1),
(9025, 'Transmisiones', '', 60, 1400, 1),
(9026, 'Suspensiones', '', 80, 5000, 1),
(9027, 'Luces Traseras', '', 90, 1500, 1),
(9028, 'Fiesta', 'Ford', 60, 300000, 0),
(9029, 'Focus', 'Ford', 89, 200000, 0),
(9030, 'Mustang', 'Ford', 20, 900000, 0),
(9031, 'Territory', 'Ford', 40, 400000, 0),
(9032, 'Corolla', 'Toyota', 56, 450000, 0),
(9033, 'Avanza', 'Toyota', 60, 351000, 0),
(9034, 'Innova', 'Toyota', 34, 460000, 0),
(9035, 'Sportage', 'Kia', 42, 620000, 0),
(9036, 'Soul', 'Kia', 35, 364000, 0),
(9037, 'Yaris', 'Toyota', 28, 312000, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuentas`
--

CREATE TABLE `cuentas` (
  `idcuenta` int(11) NOT NULL,
  `user` varchar(45) NOT NULL,
  `pass` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellidos` varchar(45) NOT NULL,
  `numero` bigint(11) NOT NULL,
  `email` varchar(45) NOT NULL,
  `direccion` text NOT NULL,
  `type` int(11) NOT NULL DEFAULT 3
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cuentas`
--

INSERT INTO `cuentas` (`idcuenta`, `user`, `pass`, `nombre`, `apellidos`, `numero`, `email`, `direccion`, `type`) VALUES
(9, 'a', 'a', 'a', 'a', 55, 'a', 'a', 3),
(10, 'almacen', 'almacen123', 'Almacenista', '', 0, '', '', 2),
(14, 'test', 'test123', 'Pedrito', 'Perez', 5511223344, 'Gomez', 'av test #123', 3);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `almacen`
--
ALTER TABLE `almacen`
  ADD PRIMARY KEY (`idproducto`);

--
-- Indices de la tabla `cuentas`
--
ALTER TABLE `cuentas`
  ADD PRIMARY KEY (`idcuenta`),
  ADD UNIQUE KEY `user` (`user`),
  ADD UNIQUE KEY `user_2` (`user`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `almacen`
--
ALTER TABLE `almacen`
  MODIFY `idproducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9038;

--
-- AUTO_INCREMENT de la tabla `cuentas`
--
ALTER TABLE `cuentas`
  MODIFY `idcuenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
