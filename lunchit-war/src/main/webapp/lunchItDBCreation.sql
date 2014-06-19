SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

DROP SCHEMA IF EXISTS `lunchIt` ;
CREATE SCHEMA IF NOT EXISTS `lunchIt` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `lunchIt` ;

-- -----------------------------------------------------
-- Table `lunchIt`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `lunchIt`.`user` ;

CREATE  TABLE IF NOT EXISTS `lunchIt`.`user` (
  `user_id` DECIMAL(10) NOT NULL ,
  `first_name` VARCHAR(45) NULL ,
  `last_name` VARCHAR(45) NULL ,
  `facebook_email` VARCHAR(45) NULL ,
  PRIMARY KEY (`user_id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lunchIt`.`restaurant`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `lunchIt`.`restaurant` ;

CREATE  TABLE IF NOT EXISTS `lunchIt`.`restaurant` (
  `restaurant_id` DECIMAL(10) NOT NULL ,
  `restaurant_name` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`restaurant_id`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lunchIt`.`menu`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `lunchIt`.`menu` ;

CREATE  TABLE IF NOT EXISTS `lunchIt`.`menu` (
  `menu_id` DECIMAL(10) NOT NULL ,
  `menu_name` VARCHAR(45) NOT NULL ,
  `menu_detail` VARCHAR(45) NOT NULL ,
  `restaurant_id` DECIMAL(10) NOT NULL ,
  PRIMARY KEY (`menu_id`) ,
  INDEX `restaurant_id` (`restaurant_id` ASC) ,
  CONSTRAINT `restaurant_id`
    FOREIGN KEY (`restaurant_id` )
    REFERENCES `lunchIt`.`restaurant` (`restaurant_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `lunchIt`.`order`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `lunchIt`.`order` ;

CREATE  TABLE IF NOT EXISTS `lunchIt`.`order` (
  `order_id` DECIMAL(10) NOT NULL ,
  `menu_id` DECIMAL(10) NOT NULL ,
  `quantity` INT NOT NULL ,
  `user_id` DECIMAL(10) NULL ,
  `date_time` DATETIME NULL ,
  `comment` VARCHAR(45) NULL ,
  PRIMARY KEY (`order_id`) ,
  INDEX `user_id` (`user_id` ASC) ,
  INDEX `menu_id_idx` (`menu_id` ASC) ,
  CONSTRAINT `user_id`
    FOREIGN KEY (`user_id` )
    REFERENCES `lunchIt`.`user` (`user_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `menu_id`
    FOREIGN KEY (`menu_id` )
    REFERENCES `lunchIt`.`menu` (`menu_id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

USE `lunchIt` ;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
