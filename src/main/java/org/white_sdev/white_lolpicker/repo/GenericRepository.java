/*
 *  Filename:  GenericRepository.java
 *  Creation Date:  Feb 6, 2021
 *  Purpose:   
 *  Author:    Obed Vazquez
 *  E-mail:    obed.vazquez@gmail.com
 * 
 *  *** ATTRIBUTION-NONCOMMERCIAL-SHAREALIKE 4.0 INTERNATIONAL *** 
 *  Online version:https://creativecommons.org/licenses/by-nc-sa/4.0/legalcode
 *  
 *  Official translations of this license are available in other languages.
 *  Creative Commons Corporation (“Creative Commons”) is not a law firm and does not provide legal services or legal advice. Distribution of Creative Commons public licenses does not create a lawyer-client or other relationship. Creative Commons makes its licenses and related information available on an “as-is” basis. Creative Commons gives no warranties regarding its licenses, any material licensed under their terms and conditions, or any related information. Creative Commons disclaims all liability for damages resulting from their use to the fullest extent possible.
 *  
 *  Using Creative Commons Public Licenses
 *  
 *  Creative Commons public licenses provide a standard set of terms and conditions that creators and other rights holders may use to share original works of authorship and other material subject to copyright and certain other rights specified in the public license below. The following considerations are for informational purposes only, are not exhaustive, and do not form part of our licenses.
 *  
 *  Considerations for licensors: Our public licenses are intended for use by those authorized to give the public permission to use material in ways otherwise restricted by copyright and certain other rights. Our licenses are irrevocable. Licensors should read and understand the terms and conditions of the license they choose before applying it. Licensors should also secure all rights necessary before applying our licenses so that the public can reuse the material as expected. Licensors should clearly mark any material not subject to the license. This includes other CC-licensed material, or material used under an exception or limitation to copyright. More considerations for licensors.
 *  
 *  Considerations for the public: By using one of our public licenses, a licensor grants the public permission to use the licensed material under specified terms and conditions. If the licensor’s permission is not necessary for any reason–for example, because of any applicable exception or limitation to copyright–then that use is not regulated by the license. Our licenses grant only permissions under copyright and certain other rights that a licensor has authority to grant. Use of the licensed material may still be restricted for other reasons, including because others have copyright or other rights in the material. A licensor may make special requests, such as asking that all changes be marked or described. Although not required by our licenses, you are encouraged to respect those requests where reasonable. More considerations for the public.
 *  
 *  Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International Public License
 *  By exercising the Licensed Rights (defined below), You accept and agree to be bound by the terms and conditions of this Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International Public License ("Public License"). To the extent this Public License may be interpreted as a contract, You are granted the Licensed Rights in consideration of Your acceptance of these terms and conditions, and the Licensor grants You such rights in consideration of benefits the Licensor receives from making the Licensed Material available under these terms and conditions.
 *  
 *  Section 1 – Definitions.
 *  
 *  Adapted Material means material subject to Copyright and Similar Rights that is derived from or based upon the Licensed Material and in which the Licensed Material is translated, altered, arranged, transformed, or otherwise modified in a manner requiring permission under the Copyright and Similar Rights held by the Licensor. For purposes of this Public License, where the Licensed Material is a musical work, performance, or sound recording, Adapted Material is always produced where the Licensed Material is synched in timed relation with a moving image.
 *  Adapter's License means the license You apply to Your Copyright and Similar Rights in Your contributions to Adapted Material in accordance with the terms and conditions of this Public License.
 *  BY-NC-SA Compatible License means a license listed at creativecommons.org/compatiblelicenses, approved by Creative Commons as essentially the equivalent of this Public License.
 *  Copyright and Similar Rights means copyright and/or similar rights closely related to copyright including, without limitation, performance, broadcast, sound recording, and Sui Generis Database Rights, without regard to how the rights are labeled or categorized. For purposes of this Public License, the rights specified in Section 2(b)(1)-(2) are not Copyright and Similar Rights.
 *  Effective Technological Measures means those measures that, in the absence of proper authority, may not be circumvented under laws fulfilling obligations under Article 11 of the WIPO Copyright Treaty adopted on December 20, 1996, and/or similar international agreements.
 *  Exceptions and Limitations means fair use, fair dealing, and/or any other exception or limitation to Copyright and Similar Rights that applies to Your use of the Licensed Material.
 *  License Elements means the license attributes listed in the name of a Creative Commons Public License. The License Elements of this Public License are Attribution, NonCommercial, and ShareAlike.
 *  Licensed Material means the artistic or literary work, database, or other material to which the Licensor applied this Public License.
 *  Licensed Rights means the rights granted to You subject to the terms and conditions of this Public License, which are limited to all Copyright and Similar Rights that apply to Your use of the Licensed Material and that the Licensor has authority to license.
 *  Licensor means the individual(s) or entity(ies) granting rights under this Public License.
 *  NonCommercial means not primarily intended for or directed towards commercial advantage or monetary compensation. For purposes of this Public License, the exchange of the Licensed Material for other material subject to Copyright and Similar Rights by digital file-sharing or similar means is NonCommercial provided there is no payment of monetary compensation in connection with the exchange.
 *  Share means to provide material to the public by any means or process that requires permission under the Licensed Rights, such as reproduction, public display, public performance, distribution, dissemination, communication, or importation, and to make material available to the public including in ways that members of the public may access the material from a place and at a time individually chosen by them.
 *  Sui Generis Database Rights means rights other than copyright resulting from Directive 96/9/EC of the European Parliament and of the Council of 11 March 1996 on the legal protection of databases, as amended and/or succeeded, as well as other essentially equivalent rights anywhere in the world.
 *  You means the individual or entity exercising the Licensed Rights under this Public License. Your has a corresponding meaning.
 *  Section 2 – Scope.
 *  
 *  License grant.
 *  Subject to the terms and conditions of this Public License, the Licensor hereby grants You a worldwide, royalty-free, non-sublicensable, non-exclusive, irrevocable license to exercise the Licensed Rights in the Licensed Material to:
 *  reproduce and Share the Licensed Material, in whole or in part, for NonCommercial purposes only; and
 *  produce, reproduce, and Share Adapted Material for NonCommercial purposes only.
 *  Exceptions and Limitations. For the avoidance of doubt, where Exceptions and Limitations apply to Your use, this Public License does not apply, and You do not need to comply with its terms and conditions.
 *  Term. The term of this Public License is specified in Section 6(a).
 *  Media and formats; technical modifications allowed. The Licensor authorizes You to exercise the Licensed Rights in all media and formats whether now known or hereafter created, and to make technical modifications necessary to do so. The Licensor waives and/or agrees not to assert any right or authority to forbid You from making technical modifications necessary to exercise the Licensed Rights, including technical modifications necessary to circumvent Effective Technological Measures. For purposes of this Public License, simply making modifications authorized by this Section 2(a)(4) never produces Adapted Material.
 *  Downstream recipients.
 *  Offer from the Licensor – Licensed Material. Every recipient of the Licensed Material automatically receives an offer from the Licensor to exercise the Licensed Rights under the terms and conditions of this Public License.
 *  Additional offer from the Licensor – Adapted Material. Every recipient of Adapted Material from You automatically receives an offer from the Licensor to exercise the Licensed Rights in the Adapted Material under the conditions of the Adapter’s License You apply.
 *  No downstream restrictions. You may not offer or impose any additional or different terms or conditions on, or apply any Effective Technological Measures to, the Licensed Material if doing so restricts exercise of the Licensed Rights by any recipient of the Licensed Material.
 *  No endorsement. Nothing in this Public License constitutes or may be construed as permission to assert or imply that You are, or that Your use of the Licensed Material is, connected with, or sponsored, endorsed, or granted official status by, the Licensor or others designated to receive attribution as provided in Section 3(a)(1)(A)(i).
 *  Other rights.
 *  
 *  Moral rights, such as the right of integrity, are not licensed under this Public License, nor are publicity, privacy, and/or other similar personality rights; however, to the extent possible, the Licensor waives and/or agrees not to assert any such rights held by the Licensor to the limited extent necessary to allow You to exercise the Licensed Rights, but not otherwise.
 *  Patent and trademark rights are not licensed under this Public License.
 *  To the extent possible, the Licensor waives any right to collect royalties from You for the exercise of the Licensed Rights, whether directly or through a collecting society under any voluntary or waivable statutory or compulsory licensing scheme. In all other cases the Licensor expressly reserves any right to collect such royalties, including when the Licensed Material is used other than for NonCommercial purposes.
 *  Section 3 – License Conditions.
 *  
 *  Your exercise of the Licensed Rights is expressly made subject to the following conditions.
 *  
 *  Attribution.
 *  
 *  If You Share the Licensed Material (including in modified form), You must:
 *  
 *  retain the following if it is supplied by the Licensor with the Licensed Material:
 *  identification of the creator(s) of the Licensed Material and any others designated to receive attribution, in any reasonable manner requested by the Licensor (including by pseudonym if designated);
 *  a copyright notice;
 *  a notice that refers to this Public License;
 *  a notice that refers to the disclaimer of warranties;
 *  a URI or hyperlink to the Licensed Material to the extent reasonably practicable;
 *  indicate if You modified the Licensed Material and retain an indication of any previous modifications; and
 *  indicate the Licensed Material is licensed under this Public License, and include the text of, or the URI or hyperlink to, this Public License.
 *  You may satisfy the conditions in Section 3(a)(1) in any reasonable manner based on the medium, means, and context in which You Share the Licensed Material. For example, it may be reasonable to satisfy the conditions by providing a URI or hyperlink to a resource that includes the required information.
 *  If requested by the Licensor, You must remove any of the information required by Section 3(a)(1)(A) to the extent reasonably practicable.
 *  ShareAlike.
 *  In addition to the conditions in Section 3(a), if You Share Adapted Material You produce, the following conditions also apply.
 *  
 *  The Adapter’s License You apply must be a Creative Commons license with the same License Elements, this version or later, or a BY-NC-SA Compatible License.
 *  You must include the text of, or the URI or hyperlink to, the Adapter's License You apply. You may satisfy this condition in any reasonable manner based on the medium, means, and context in which You Share Adapted Material.
 *  You may not offer or impose any additional or different terms or conditions on, or apply any Effective Technological Measures to, Adapted Material that restrict exercise of the rights granted under the Adapter's License You apply.
 *  Section 4 – Sui Generis Database Rights.
 *  
 *  Where the Licensed Rights include Sui Generis Database Rights that apply to Your use of the Licensed Material:
 *  
 *  for the avoidance of doubt, Section 2(a)(1) grants You the right to extract, reuse, reproduce, and Share all or a substantial portion of the contents of the database for NonCommercial purposes only;
 *  if You include all or a substantial portion of the database contents in a database in which You have Sui Generis Database Rights, then the database in which You have Sui Generis Database Rights (but not its individual contents) is Adapted Material, including for purposes of Section 3(b); and
 *  You must comply with the conditions in Section 3(a) if You Share all or a substantial portion of the contents of the database.
 *  For the avoidance of doubt, this Section 4 supplements and does not replace Your obligations under this Public License where the Licensed Rights include other Copyright and Similar Rights.
 *  Section 5 – Disclaimer of Warranties and Limitation of Liability.
 *  
 *  Unless otherwise separately undertaken by the Licensor, to the extent possible, the Licensor offers the Licensed Material as-is and as-available, and makes no representations or warranties of any kind concerning the Licensed Material, whether express, implied, statutory, or other. This includes, without limitation, warranties of title, merchantability, fitness for a particular purpose, non-infringement, absence of latent or other defects, accuracy, or the presence or absence of errors, whether or not known or discoverable. Where disclaimers of warranties are not allowed in full or in part, this disclaimer may not apply to You.
 *  To the extent possible, in no event will the Licensor be liable to You on any legal theory (including, without limitation, negligence) or otherwise for any direct, special, indirect, incidental, consequential, punitive, exemplary, or other losses, costs, expenses, or damages arising out of this Public License or use of the Licensed Material, even if the Licensor has been advised of the possibility of such losses, costs, expenses, or damages. Where a limitation of liability is not allowed in full or in part, this limitation may not apply to You.
 *  The disclaimer of warranties and limitation of liability provided above shall be interpreted in a manner that, to the extent possible, most closely approximates an absolute disclaimer and waiver of all liability.
 *  Section 6 – Term and Termination.
 *  
 *  This Public License applies for the term of the Copyright and Similar Rights licensed here. However, if You fail to comply with this Public License, then Your rights under this Public License terminate automatically.
 *  Where Your right to use the Licensed Material has terminated under Section 6(a), it reinstates:
 *  
 *  automatically as of the date the violation is cured, provided it is cured within 30 days of Your discovery of the violation; or
 *  upon express reinstatement by the Licensor.
 *  For the avoidance of doubt, this Section 6(b) does not affect any right the Licensor may have to seek remedies for Your violations of this Public License.
 *  For the avoidance of doubt, the Licensor may also offer the Licensed Material under separate terms or conditions or stop distributing the Licensed Material at any time; however, doing so will not terminate this Public License.
 *  Sections 1, 5, 6, 7, and 8 survive termination of this Public License.
 *  Section 7 – Other Terms and Conditions.
 *  
 *  The Licensor shall not be bound by any additional or different terms or conditions communicated by You unless expressly agreed.
 *  Any arrangements, understandings, or agreements regarding the Licensed Material not stated herein are separate from and independent of the terms and conditions of this Public License.
 *  Section 8 – Interpretation.
 *  
 *  For the avoidance of doubt, this Public License does not, and shall not be interpreted to, reduce, limit, restrict, or impose conditions on any use of the Licensed Material that could lawfully be made without permission under this Public License.
 *  To the extent possible, if any provision of this Public License is deemed unenforceable, it shall be automatically reformed to the minimum extent necessary to make it enforceable. If the provision cannot be reformed, it shall be severed from this Public License without affecting the enforceability of the remaining terms and conditions.
 *  No term or condition of this Public License will be waived and no failure to comply consented to unless expressly agreed to by the Licensor.
 *  Nothing in this Public License constitutes or may be interpreted as a limitation upon, or waiver of, any privileges and immunities that apply to the Licensor or You, including from the legal processes of any jurisdiction or authority.
 *  Creative Commons is not a party to its public licenses. Notwithstanding, Creative Commons may elect to apply one of its public licenses to material it publishes and in those instances will be considered the “Licensor.” The text of the Creative Commons public licenses is dedicated to the public domain under the CC0 Public Domain Dedication. Except for the limited purpose of indicating that material is shared under a Creative Commons public license or as otherwise permitted by the Creative Commons policies published at creativecommons.org/policies, Creative Commons does not authorize the use of the trademark “Creative Commons” or any other trademark or logo of Creative Commons without its prior written consent including, without limitation, in connection with any unauthorized modifications to any of its public licenses or any other arrangements, understandings, or agreements concerning use of licensed material. For the avoidance of doubt, this paragraph does not form part of the public licenses.
 *  
 *  Creative Commons may be contacted at creativecommons.org.
 */

package org.white_sdev.white_lolpicker.repo;

//import lombok.extern.slf4j.Slf4j;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.TypedQuery;
import javax.persistence.UniqueConstraint;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.SessionFactory;
import static org.white_sdev.white_validations.parameters.ParameterValidator.notNullValidation;

//import static org.white_sdev.white_validations.parameters.ParameterValidator.notNullValidation;

/**
 * 
 * @author <a href="mailto:obed.vazquez@gmail.com">Obed Vazquez</a>
 * @param <E>
 * @param <ID>
 * @since Feb 6, 2021
 */
//@Slf4j
public interface GenericRepository <E extends Object, ID extends Serializable>  {
    
    public EntityManager getEntityManager();
    
    public default SessionFactory getSessionFactory(){
	try {
	    return getEntityManager().unwrap(SessionFactory.class);
	} catch (Exception e) {
	    throw new RuntimeException("Impossible to complete operation",e);
	}
    }
    
    public default List<E> findBy(String field, Object value) {
	return filteredFind(new HashMap<String, Object>(){{put(field, value);}});
    }
    
    /**
     * JPA
     * @param filters
     * @return 
     */
    public default List<E> filteredFind(Map<String, Object> filters) {
//	Criteria crit = getCurrentSession().createCriteria(getEntityClass());
	CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
	CriteriaQuery<E> criteriaQuery = criteriaBuilder.createQuery(getEntityClass());
	Root<E> root= criteriaQuery.from(getEntityClass());
	
//	Predicate authorNamePredicate = cb.equal(book.get("author"), authorName);
//        Predicate titlePredicate = cb.like(book.get("title"), "%" + title + "%");
//        cq.where(authorNamePredicate, titlePredicate);
	
	ArrayList<Predicate> predicates=new ArrayList<>();
	filters.entrySet().forEach(filter -> {
	    String key=filter.getKey();
	    Object value=filter.getValue();
	    predicates.add(criteriaBuilder.equal(root.get(key), value));
	    
//	    crit.add(value!=null?Restrictions.eq(filter.getKey(), value):Restrictions.isNull(filter.getKey()));
	});
	
	List<E> entities;
//	entities = (List<Champion>) crit.list();//Main search
	Predicate[] predicatesArray= new Predicate[predicates.size()];
	predicates.toArray(predicatesArray);
	criteriaQuery.where(predicatesArray);
	TypedQuery<E> query = getEntityManager().createQuery(criteriaQuery);
	entities = query.getResultList();//Main search

	if (entities == null || entities.isEmpty()) entities = new ArrayList<>();
	return entities;
    }
    
    /**
     * It is the same as SaveOrUpdate()
     * Forces a Managed State in the {@link Entity}. (Push in case of found) In the event that the {@link Entity entity} is found in the DataSource, 
     * this will update the DataSource. It is similar to a simple save but for all states of an entity. Uses {@link #saveOrUpdate(java.lang.Object) } or 
     * COPY OF {@link #saveOrUpdate(java.lang.Object) }.
     * @param entity
     * @return the persisted entity
     */
    
    public default E forceManaged(E entity){
	try{
	    if(isTranscient(entity)){
		getEntityManager().persist(entity);
		return entity;
	    }else if(isDetached(entity)){
		return getEntityManager().merge(entity);
	    }else if(isPersistent(entity)){
		//warn log
		return entity;
	    }else{
		throw new RuntimeException("The provided entity is nor Transcient,Detached or Persistent, this should never happen please report this Bug.");
	    }
	}catch(Exception ex){
	    throw new RuntimeException("Impossible to save the entity "+entity,ex);
	}
    }
    
    //Push
    public default E mergeByUniqueOrPersist(E entity){
	notNullValidation(entity);
	try {
	    E foundEntity=null;
	    try{
		foundEntity=findByUnique(entity);
	    }catch(Exception ex){}
	    
	    if(foundEntity==null) {
		getEntityManager().persist(entity);
		return entity;
	    }
	    
	    copyId(foundEntity,entity);
	    return getEntityManager().merge(entity);
	    
	} catch (Exception e) {
	    throw new RuntimeException("Impossible to mergeByUniqueOrPersist the entity"+entity,e);
	}
    }
    
    /**
     * Uses reflection to obtain the name of the fields marked as (the first) Unique constraints and their respective values on the provided {@code E entity} 
     * and store them as pairs in the {@link LinkedHashMap} used to {@link #filteredFind(java.util.Map) } a query to the DataBase looking 
     * for an entity that will match and return that entity or call {@link #synchronize(java.lang.Object) } to save it if it is not found
     * @param entity
     * @return 
     */
    //findOrSave does not exist bc you need an ID too Look for it and a transient object cant have one.
    public default E findByUniqueOrPersist(E entity){
	try {
	    E foundEntity=null;
	    try{
		foundEntity=findByUnique(entity);
	    }catch(Exception ex){}
	    
	    if(foundEntity!=null) return foundEntity;
	    getEntityManager().persist(entity);
	    return entity;
	} catch (Exception e) {
	    throw new RuntimeException("Impossible to findByUniqueOrSave the entity",e);
	}
    }
    
    /**
     * Uses reflection to obtain the name of the fields marked as (the first) Unique constraints and their respective values on the provided {@code E entity} 
     * and store them as pairs in the {@link LinkedHashMap} used to {@link #filteredFind(java.util.Map) } a query to the DataBase looking 
     * for an entity that will match and return that entity or {@code null} if not found.
     * @param entity
     * @return 
     */
    public default E findByUnique(E entity){
	try {
	    LinkedHashMap<String,Object> multipleFieldsUniqueConstraints= getUniqueConstraintsToFilterMap(entity);
	    if(multipleFieldsUniqueConstraints!=null || multipleFieldsUniqueConstraints.size()<1) return null;

	    List<E> entitiesFound=filteredFind(multipleFieldsUniqueConstraints);
	    if(entitiesFound==null || entitiesFound.size()<1) return null;
	    if(entitiesFound.size()>1) throw new RuntimeException("More than 1 entity was found with the same Unique Key. Please report the entire scenario.");

	    return entitiesFound.get(0);

	} catch (Exception e) {
	    throw new RuntimeException("Impossible to findByUnique Columns",e);
	}
    }
    
    public default E saveOrUpdate(E entity){
	try {
	    getSessionFactory().getCurrentSession().saveOrUpdate(entity);
	    return entity;
	} catch (Exception e) {
	    throw new RuntimeException("Impossible to complete operation",e);
	}
    }
    
    //<editor-fold defaultstate="collapsed" desc="Util">

    public default boolean isTranscient(E entity){
	try{
	    return getIdValue(entity)==null;
	}catch(Exception ex){
	    throw new RuntimeException("Impossible to determine if the entity "+entity+" is transcient",ex);
	}
    }
    
    public default boolean isDetached(E entity){
	try{
	    return getIdValue(entity)!=null;
	}catch(Exception ex){
	    throw new RuntimeException("Impossible to determine if the entity "+entity+" is Detached",ex);
	}
    }
    
    public default boolean isPersistent(E entity){
	try{
	    return getEntityManager().contains(entity);
	}catch(Exception ex){
	    throw new RuntimeException("Impossible to determine if the entity "+entity+" is Detached",ex);
	}
    }

    public default ID getIdValue(E entity){
	try{
//	    EntityManagerFactory factory=Persistence.createEntityManagerFactory(getEntityClass().getCanonicalName());
//	    return (ID)factory.getPersistenceUnitUtil().getIdentifier(entity);
	    return (ID)getEntityManager().getEntityManagerFactory().getPersistenceUnitUtil().getIdentifier(entity);
	}catch(Exception ex){
	    return null;
	}
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Reflexion">

    
    public default Field getIdType() {
	try {
	    for (Field field : getEntityClass().getDeclaredFields()) {
		if ( !field.isAnnotationPresent(Id.class)){
		    Method method=getGetterMethod(field,getEntityClass());
		    if((method!=null && method.isAnnotationPresent(Id.class)))return field;
		}
		return field;
	    }
	    return null;
	} catch (Exception e) {
	    throw new RuntimeException("Impossible to obtain the ID Field of this Entity Class",e);
	}
    }
    
    public default void copyId(E source, E target) {
	try {
	    Field field=getIdType();
	    try{
		var srcIdValue=getIdValue(source);
		if(srcIdValue==null) throw new RuntimeException("Entity "+source+" has no Id in it to copy to "+target);
		field.set(target, srcIdValue);
	    }catch (Exception ex){
		getSetterMethod(field,getEntityClass()).invoke(target, getIdValue(source));
	    }
	} catch (Exception e) {
	    throw new RuntimeException("Impossible to copy ID from entity "+source + " to targetEntity: "+target,e);
	}
    }
    
    /**
     * Uses Java Reflection to obtain the name and value (format used in {@link #filteredFind(java.util.Map) }) of the first Unique constraint (single or Multiple fields) marked in the 
     * {@code E} Entity (used by the coder as a primary key instead of the formal {@link Id} usually because the DataBase requires an int as a primary for performance issues).
     * @param entity
     * @return 
     */
    public default LinkedHashMap<String,Object> getUniqueConstraintsToFilterMap(E entity){
	try {
	    List<String> uniqueConstraintFieldNames = getUniqueConstraintNames(getEntityClass());
	    LinkedHashMap<String,Object> multipleFieldsUniqueConstraints=new LinkedHashMap<>();
	    
	    if(multipleFieldsUniqueConstraints!=null) for(String uniqueFieldName:uniqueConstraintFieldNames)  
		multipleFieldsUniqueConstraints.put(uniqueFieldName,getValueOfField(uniqueFieldName,entity));
	    
	    
	    if(multipleFieldsUniqueConstraints.size()<1){
		Field uniqueConstraintFieldName = getSingleUniqueConstraintField();
		return uniqueConstraintFieldName!=null
			?new LinkedHashMap<String,Object>(){{put(uniqueConstraintFieldName.getName(),uniqueConstraintFieldName);}}
			:null;
	    }else{
		return multipleFieldsUniqueConstraints;
	    }

	} catch (Exception e) {
	    throw new RuntimeException("Impossible to getUniqueConstraintsToFilterMap",e);
	}
    }
    
    public default List<String> getUniqueConstraintNames(Class<E> clazz){
	try {
	    ArrayList<String> uniqueKeyFieldsName= new ArrayList<>();
	    for (Annotation annotation : clazz.getAnnotations()) {
		Class<? extends Annotation> type = annotation.annotationType();
		if(type.equals(javax.persistence.Table.class)){
		    for (Method method : type.getDeclaredMethods()) {
			javax.persistence.UniqueConstraint[] nestedAnnotation;
			try{
			    nestedAnnotation = (javax.persistence.UniqueConstraint[])method.invoke(annotation, (Object[])null);
			}catch(Exception ex){
			    continue;
			}
		       UniqueConstraint uniqueConstraintAnnotation=nestedAnnotation[0];
		       Class<? extends Annotation> uniqueConstraintType=uniqueConstraintAnnotation.annotationType();
		       for (Method uniqueConstraintMethod : uniqueConstraintType.getDeclaredMethods()) {
			    Object value = uniqueConstraintMethod.invoke(uniqueConstraintAnnotation, (Object[])null);
			    if(uniqueConstraintMethod.getName().equals("columnNames")){
				String[] fieldNames=(String[])value;
				uniqueKeyFieldsName=new ArrayList<>(Arrays.asList(fieldNames));
			    }
			}
		    }
		}
	    }
	    return uniqueKeyFieldsName;
	} catch (Exception e) {
	    throw new RuntimeException("Impossible to getUniqueConstraintNames of class "+clazz,e);
	}
    }
    
    public default Field getSingleUniqueConstraintField(){
	try {
	    for (Field field : getEntityClass().getDeclaredFields()) {
		if ( field.isAnnotationPresent(Column.class)){
		    if(isColumnUnique(field)){
			return field;
		    }
		}else{
		    try{
			Method method=getGetterMethod(field,getEntityClass());
			if((method!=null && method.isAnnotationPresent(Column.class))){
			    if(isColumnUnique(method)){
				return field;
			    }
			}
		    }catch(Exception ex){}
		}
	    }
	    return null;
	} catch (Exception e) {
	    throw new RuntimeException("Impossible to get Single Field with UniqueConstraint",e);
	}
    }
    
    public static boolean isColumnUnique(Field field){
	try {
	    for(Annotation annotation:field.getAnnotations()){
		Class<? extends Annotation> type = annotation.annotationType();
		if(type.equals(Column.class)){
		    for (Method method : type.getDeclaredMethods()) {
			Boolean value=false;
			try{ 
			    value = (Boolean)method.invoke(annotation);
			}catch(Exception e){
			    
			}
			if(method.getName().equals("unique") && value){
			    return true;
			}
		    }
		}
	    }
	    return false;
	} catch (Exception e) {
	    throw new RuntimeException("Impossible to check if the field has the colum Column or if it has the method Unique",e);
	}
    }
    
    public static boolean isColumnUnique(Method method){
	try {
	    for(Annotation annotation:method.getAnnotations()){
		Class<? extends Annotation> type = annotation.annotationType();
		if(type.equals(Column.class)){
		    for (Method annotationMethod : type.getDeclaredMethods()) {
			Boolean value = (Boolean)method.invoke(annotation, (Object[])null);
			if(annotationMethod.getName().equals("unique") && value){
			    return true;
			}
		    }
		}
	    }
	    return false;
	} catch (Exception e) {
	    throw new RuntimeException("Impossible to check if the field has the colum Column or if it has the method Unique",e);
	}
    }
    
    
    public default Object getValueOfField(String fieldName,E instance){
	try {
	    Class<?> clazz=getEntityClass();
	    for (Field field : clazz.getDeclaredFields()) {
		if(field.getName().equals(fieldName)) {
			boolean isAccessible = field.isAccessible();
			try {
			    field.setAccessible(true);
			    Object value = field.get(instance);
			    field.setAccessible(isAccessible);
			    return value;
			}  catch (ReflectiveOperationException e) {
			    throw new RuntimeException("Impossible to obtain the Value of field "+fieldName+" of instance "+instance, e);
			}
		}
	    }
	    throw new RuntimeException("Field "+fieldName+" not found in instance "+instance);
	} catch (Exception e) {
	    throw new RuntimeException("Impossible to complete operation",e);
	}
    }
    
    public default Method getGetterMethod(Field field,Class<?> entityClass) {
	try{
	    for (PropertyDescriptor pd:Introspector.getBeanInfo(entityClass).getPropertyDescriptors()){
		if(pd.getName().equals(field.getName())){
		    return pd.getReadMethod();
		}
	    }
	}catch(IntrospectionException e){
	    throw new RuntimeException("Impossible to getGetterMethod of "+entityClass,e);
	}
	return null;
    }
    
    public default Method getSetterMethod(Field field,Class<?> entityClass) {
	try{
	    for (PropertyDescriptor pd:Introspector.getBeanInfo(entityClass).getPropertyDescriptors()){
		if(pd.getName().equals(field.getName())){
		    return pd.getWriteMethod();
		}
	    }
	}catch(IntrospectionException e){
	    throw new RuntimeException("Impossible to getGetterMethod of "+entityClass,e);
	}
	return null;
    }
    
    public default Class<E> getEntityClass(){
	Class<E> entityClass=null;
	if (entityClass == null) {
	    ParameterizedType thisType = (ParameterizedType) getClass().getGenericSuperclass();
	    entityClass = (Class<E>) thisType.getActualTypeArguments()[0];
	}
	return entityClass;
    }
    
    //</editor-fold>
    

    
}
