#Техническое задание 

Задание: необходимо создать базу данных для геолокацинной онлайн-игры, с возможностью хранения в ней 
полей с информацией о пользователе (логин, пароль), а также полей для хранения внутриигровых 
значений (уровень героя, количество ресурсов, стоимость юнитов и  т.д.).

#Мега-таблица

MineTypes:
minetypes_id,
typename,
picture,
radius

Mine:
mine_id,
type_id,
latitude,
longtitude,
value

Race:
race_id,
name,
pictur

Abilities:
abilities_id,
name,
picture
 
Type:
type_id,
name

TypeAbilities:
typeabilities_id,
type_id,
abilities_id

RaceAbilities:
raceabilities_id,
race_id
abilities_id,
value

UnitAbilities:
unitabilities_id,
unit_id,
abilities_id,
value

Unit:
unit_id,
name,
picture,
type_id,
race_id

user:
user_id,
user_name,
e-mail,
password

place:
place_id,
time,
latitude,
longitude,
player_id

playerAbilities:
playerabilities,
player_id,
ability_id,
value

equipment:
equipment_id,
name

TYPE:
type_id,
name

player:
player_id,
player_name,
race_id,
type_id,
radius

playerDress:
playerdress_id,
player_id,
equipment_id

playerEquipment:
playerequipment_id,
player_id,
equipment_id,
value


equipmentAbilities:
equipmentabilities,
equipment_id,
ability_id,
value

abilities:
abilities_id,
name,
picture

race:
race_id,
name,
picture
 
