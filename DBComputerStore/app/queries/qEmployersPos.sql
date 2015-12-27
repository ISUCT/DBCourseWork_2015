/**
 *
 * @author dmitry
 * @name qEmployersPos
 * @public
 */ 
Select t1.s_name,t1.empl_id, t.pos_id, t.pos_helds_id 
From EMPLOYEE t1
 Inner Join POS_HELDS t on t1.empl_id = t.empl_id