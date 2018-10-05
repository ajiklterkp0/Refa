
-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-02-2018 a las 16:58:29
-- Versión del servidor: 10.1.26-MariaDB
-- Versión de PHP: 7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `historia_clinica`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `antecedentes_patologicos`
--

CREATE TABLE `antecedentes_patologicos` (
  `id` int(11) NOT NULL,
  `enfermedades_infecto` text CHARACTER SET latin1 NOT NULL,
  `cronico_degenerativas` text CHARACTER SET latin1 NOT NULL,
  `alergicos` text CHARACTER SET latin1 NOT NULL,
  `quirurgicos` text CHARACTER SET latin1 NOT NULL,
  `traumatologicos` text CHARACTER SET latin1 NOT NULL,
  `transfuciones` text CHARACTER SET latin1 NOT NULL,
  `convulsiones` text CHARACTER SET latin1 NOT NULL,
  `adicciones` text CHARACTER SET latin1 NOT NULL,
  `hospitalizaciones` text CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `atecedentes_familiares`
--

CREATE TABLE `atecedentes_familiares` (
  `id` int(11) NOT NULL,
  `heredo_familiar` text CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `atecedentes_guineco_obstetricos`
--

CREATE TABLE `atecedentes_guineco_obstetricos` (
  `id` int(11) NOT NULL,
  `menarca` varchar(100) CHARACTER SET latin1 NOT NULL,
  `ivsa` varchar(50) CHARACTER SET latin1 NOT NULL,
  `numero_parejas` int(11) NOT NULL,
  `embarazos` int(11) NOT NULL,
  `metodo_anticonceptivo` varchar(100) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `atecedentes_no_patologicos`
--

CREATE TABLE `atecedentes_no_patologicos` (
  `id` int(11) NOT NULL,
  `alimentacion` text CHARACTER SET latin1 NOT NULL,
  `habitacion` text CHARACTER SET latin1 NOT NULL,
  `habitos_higienicos` text CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `consultas`
--

CREATE TABLE `consultas` (
  `id` int(11) NOT NULL,
  `id_paciente` int(11) NOT NULL,
  `t_a` text CHARACTER SET latin1 NOT NULL,
  `temperatura` text CHARACTER SET latin1 NOT NULL,
  `descripcion` text CHARACTER SET latin1 NOT NULL,
  `receta` text CHARACTER SET latin1 NOT NULL,
  `fecha` varchar(100) CHARACTER SET latin1 NOT NULL,
  `hora` varchar(100) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ficha_identificacion`
--

CREATE TABLE `ficha_identificacion` (
  `id` int(11) NOT NULL,
  `n_control` int(11) NOT NULL,
  `carrera` varchar(200) CHARACTER SET latin1 NOT NULL,
  `nombre` varchar(100) CHARACTER SET latin1 NOT NULL,
  `genero` varchar(50) CHARACTER SET latin1 NOT NULL,
  `edad` varchar(11) CHARACTER SET latin1 NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `lugar_nacimiento` text CHARACTER SET latin1 NOT NULL,
  `lugar_origen` text CHARACTER SET latin1 NOT NULL,
  `domicilio` text CHARACTER SET latin1 NOT NULL,
  `estado_civil` varchar(50) CHARACTER SET latin1 NOT NULL,
  `religion` varchar(150) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inspeccion_general`
--

CREATE TABLE `inspeccion_general` (
  `id` int(11) NOT NULL,
  `general` text CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `signos_vitales_somatometria`
--

CREATE TABLE `signos_vitales_somatometria` (
  `id` int(11) NOT NULL,
  `pulso` varchar(100) CHARACTER SET latin1 NOT NULL,
  `presion` varchar(100) CHARACTER SET latin1 NOT NULL,
  `temperatura` varchar(100) CHARACTER SET latin1 NOT NULL,
  `frecuencia_respiratoria` varchar(100) CHARACTER SET latin1 NOT NULL,
  `peso` varchar(50) CHARACTER SET latin1 NOT NULL,
  `talla` varchar(50) CHARACTER SET latin1 NOT NULL,
  `indice_masa_corporal` varchar(50) CHARACTER SET latin1 NOT NULL,
  `tipo_sangre` varchar(50) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `nombre` text CHARACTER SET latin1 NOT NULL,
  `usuario` text CHARACTER SET latin1 NOT NULL,
  `password` text CHARACTER SET latin1 NOT NULL,
  `tipo_us` varchar(50) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `antecedentes_patologicos`
--
ALTER TABLE `antecedentes_patologicos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `atecedentes_familiares`
--
ALTER TABLE `atecedentes_familiares`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `atecedentes_guineco_obstetricos`
--
ALTER TABLE `atecedentes_guineco_obstetricos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `ficha_identificacion`
--
ALTER TABLE `ficha_identificacion`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `inspeccion_general`
--
ALTER TABLE `inspeccion_general`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `antecedentes_patologicos`
--
ALTER TABLE `antecedentes_patologicos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `atecedentes_familiares`
--
ALTER TABLE `atecedentes_familiares`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `atecedentes_guineco_obstetricos`
--
ALTER TABLE `atecedentes_guineco_obstetricos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `ficha_identificacion`
--
ALTER TABLE `ficha_identificacion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `inspeccion_general`
--
ALTER TABLE `inspeccion_general`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
