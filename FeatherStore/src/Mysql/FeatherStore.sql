-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema FeahterStore
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema FeahterStore
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `FeahterStore` DEFAULT CHARACTER SET utf8 ;
USE `FeahterStore` ;

-- -----------------------------------------------------
-- Table `FeahterStore`.`Usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `FeahterStore`.`Usuarios` (
  `idUsuarios` INT AUTO_INCREMENT NULL,
  `Username` VARCHAR(45) NULL,
  `Password_` VARCHAR(45) NULL,
  `Correo` VARCHAR(45) NULL,
  `Nombre` VARCHAR(45) NULL,
  `Pais` VARCHAR(45) NULL,
  PRIMARY KEY (`idUsuarios`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `FeahterStore`.`Desarrolladores`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `FeahterStore`.`Desarrolladores` (
  `idDesarrolladores` INT AUTO_INCREMENT NULL,
  `Correo` VARCHAR(45) NULL,
  `Username` VARCHAR(45) NULL,
  `Nombre` VARCHAR(45) NULL,
  `Direccion` VARCHAR(120) NULL,
  `Pais` VARCHAR(45) NULL,
  `Password_` VARCHAR(45) NULL,
  `Titulo` VARCHAR(45) NULL,
  PRIMARY KEY (`idDesarrolladores`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `FeahterStore`.`Software`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `FeahterStore`.`Software` (
  `idSoftware` INT AUTO_INCREMENT NULL,
  `Nombre` VARCHAR(45) NULL,
  `Precio` VARCHAR(45) NULL,
  `Descripcion` VARCHAR(300) NULL,
  `Desarrollador_es` VARCHAR(120) NULL,
  `Repo_Git` VARCHAR(100) NULL,
  `Categoria` VARCHAR(45) NULL,
  `Desarrolladores_idDesarrolladores` INT NOT NULL,
  PRIMARY KEY (`idSoftware`),
  INDEX `fk_Software_Desarrolladores_idx` (`Desarrolladores_idDesarrolladores` ASC),
  CONSTRAINT `fk_Software_Desarrolladores`
    FOREIGN KEY (`Desarrolladores_idDesarrolladores`)
    REFERENCES `FeahterStore`.`Desarrolladores` (`idDesarrolladores`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `FeahterStore`.`Usuarios_has_Software`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `FeahterStore`.`Usuarios_has_Software` (
  `Usuarios_idUsuarios` INT NOT NULL,
  `Software_idSoftware` INT NOT NULL,
  PRIMARY KEY (`Usuarios_idUsuarios`, `Software_idSoftware`),
  INDEX `fk_Usuarios_has_Software_Software1_idx` (`Software_idSoftware` ASC),
  INDEX `fk_Usuarios_has_Software_Usuarios1_idx` (`Usuarios_idUsuarios` ASC),
  CONSTRAINT `fk_Usuarios_has_Software_Usuarios1`
    FOREIGN KEY (`Usuarios_idUsuarios`)
    REFERENCES `FeahterStore`.`Usuarios` (`idUsuarios`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Usuarios_has_Software_Software1`
    FOREIGN KEY (`Software_idSoftware`)
    REFERENCES `FeahterStore`.`Software` (`idSoftware`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
