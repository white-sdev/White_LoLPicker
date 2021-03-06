/*
 *  Filename:  OldCounterExtractor.java
 *  Creation Date:  Dec 7, 2020
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

package org.white_sdev.white_lolpicker.service;

import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import static org.white_sdev.propertiesmanager.model.service.PropertyProvider.getProperty;
import org.white_sdev.white_lolpicker.model.persistence.Champion;
import org.white_sdev.white_lolpicker.model.persistence.Counter;
import org.white_sdev.white_lolpicker.model.bean.CountersSearch;
import org.white_sdev.white_lolpicker.model.persistence.LaneCounter;
import org.white_sdev.white_lolpicker.model.persistence.Patch;
import org.white_sdev.white_lolpicker.model.persistence.Role;
import org.white_sdev.white_lolpicker.model.persistence.UggRank;
import org.white_sdev.white_lolpicker.repo.PatchRankRepositoryImpl;
import org.white_sdev.white_seleniumframework.framework.WebDriverUtils;

import static org.white_sdev.white_validations.parameters.ParameterValidator.notNullValidation;

/**
 * 
 * @author <a href="mailto:obed.vazquez@gmail.com">Obed Vazquez</a>
 * @since Dec 7, 2020
 */
@Slf4j
public class OldCounterExtractor { //TODO Once DB Extraction is kind of working delete this class

    

    public static List<Patch> extractedPatches=null;
    public static List<LaneCounter> laneCounters=new ArrayList<>();
    public static List<Counter> counters=new ArrayList<>();
    public static Double average=null;
    public static CountersSearch lastCounterSearch;
    
    
    @Autowired
    PatchRankRepositoryImpl patchRankRepository;
    
    public void loadAllCounters(WebDriver driver) {
	log.trace("::loadCounters(driver) - Start: ");
	notNullValidation(driver);
	try {
	    
            ArrayList<Patch> patchesToExtract=PatchExtractor.getPatches(driver);
            List<UggRank> ranks=Boolean.parseBoolean(getProperty("counters.lower-ranks-only"))?UggRank.lowerRanks:UggRank.everyRank;
	    List<Champion> champions=ChampionExtractor.champs;
	    
	    
	    Integer patchCounter=0,rankCounter=0,champCounter=0;
	    Double patchStatus=0d, rankStatus=0d, champStatus=0d;
	    log.info("::loadCounters(driver): Starting Counter Extraction Process at "+java.time.LocalDateTime.now().format(DateTimeFormatter.ISO_TIME));
	    DecimalFormat twoDecimalsFormat=new DecimalFormat("#.##");
	    if(champions == null || champions.size()<1) throw new RuntimeException("Champions have not been loaded. Please first load the champions then call this method. "
		    + "You can use ChampionExctractor to load all champions from U.GG");
	    
	    for(Champion champ:champions){
		log.info("::loadCounters(driver): Extracting Champion Counters: "+champ);
		for(UggRank rank:ranks){
		    log.info("::loadCounters(driver): Extracting U.GG Rank: "+rank.getPrintableName());
		    for(Patch patch:patchesToExtract){
//			loadChampionCounters(new CountersSearch(patch,rank,champ,driver));
			
			++patchCounter;
			patchStatus=patchCounter*100d/champions.size()/ranks.size()/patchesToExtract.size();
			log.info("::loadCounters(driver): Extraction Process Status: "+twoDecimalsFormat.format(champStatus+rankStatus+patchStatus)+"%");
			
		    }patchCounter=0;
//		    rank.calculateAvgNumOfMatches();
		    
		    ++rankCounter;
		    rankStatus=rankCounter*100d/champions.size()/ranks.size();
		    log.info("::loadCounters(driver): Extraction Process Status: "+twoDecimalsFormat.format(champStatus+rankStatus)+"%");
		    
		}rankCounter=0;
                
		
		++champCounter;
		champStatus=((champCounter*100d)/champions.size());
		log.info("::loadCounters(driver): Extraction Process Status: "+twoDecimalsFormat.format(champStatus)+"%");
            }
	    
	    
	    log.info("::loadCounters(driver): Calculating Counter Bonus at "+java.time.LocalDateTime.now().format(DateTimeFormatter.ISO_TIME));
	    counters.forEach((counter) -> {
//		counter.calculateBonus(laneCounters);
	    });
	    
	    extractedPatches=patchesToExtract;
	    
	    log.info("::loadCounters(driver): Counter Extraction Process Finished at "+java.time.LocalDateTime.now());
	    
	    
	    log.trace("::loadCounters(driver) - Finish: ");
	} catch (Exception e) {
	    throw new RuntimeException("Impossible to complete the operation due to an unknown internal error.", e);
	}
    }

    public void loadChampionCounters(CountersSearch counterSearch) {
	log.trace("::loadChampionCounters(counterSearch) - Start: ");
	notNullValidation(counterSearch);
	try {
	    
	    Patch patch=counterSearch.patchRank.patch;
	    UggRank rank=counterSearch.patchRank.rank;
	    Champion champ=counterSearch.champ;
	    WebDriver driver=counterSearch.utils.driver;
	    
	    for(Role rol:Role.allRoles){
//		loadChampionCounterWebpage(new CountersSearch(patch, rank, champ, driver),rol);
		
		forceElementsLoad(driver); //multiple clicks on "View More Champions" button
		
		Boolean loadLaneCountersSuccesfully=true;
		List<WebElement> webLaneCounters=null;
		List<WebElement> webGoldDiferences=null;
		List<WebElement> webMatchTotalGames=null;
		
		try{ //Loading LANE Counters
		    webLaneCounters=driver.findElements(By.xpath("//*[contains(@class, 'counters-list gold-diff')]//*[contains(@class, 'champion-name')]"));
		    webGoldDiferences=driver.findElements(By.xpath("//*[contains(@class, 'counters-list gold-diff')]//div[contains(@class, 'col-3')]//div[contains(@class, 'win-rate')]"));
		    webMatchTotalGames=driver.findElements(By.xpath("//*[contains(@class, 'counters-list gold-diff')]//div[contains(@class, 'col-3')]//div[contains(@class, 'total-games')]"));

		    
		}catch(Exception e){
		    log.debug("::loadChampionCounters(counterSearch): Impossible to load Champion ["+champ+"] laneCounters");
		    loadLaneCountersSuccesfully=false;
		}
		if(loadLaneCountersSuccesfully)	    mapLaneCounters(patch, rank, champ, rol,webLaneCounters,webGoldDiferences,webMatchTotalGames);
		
		//Loading Counters
		List<WebElement> webCounters=driver.findElements(By.xpath("//*[contains(@class, 'counters-list best-win-rate')]//*[contains(@class, 'champion-name')]"));
		List<WebElement> webWinrates=driver.findElements(By.xpath("//*[contains(@class, 'counters-list best-win-rate')]//div[contains(@class, 'col-3')]//div[contains(@class, 'win-rate')]"));
		List<WebElement> webWinratesTotalGames=driver.findElements(By.xpath("//*[contains(@class, 'counters-list best-win-rate')]//div[contains(@class, 'col-3')]//div[contains(@class, 'total-games')]"));
		
		log.debug("::loadChampionCounters(counterSearch):  Loading Champion Counters [champ:"+champ+"],[patch:"+patch+"], [rank:"+rank.getPrintableName()+"], [rol:"+rol+"]");
		mapCounters(patch, rank,champ, rol,webCounters,webWinrates,webWinratesTotalGames);
		
		
		
		
	    }
	    
	    
	    
	    log.trace("::loadChampionCounters(patch,rank,champ,driver) - Finish: ");
	} catch (Exception e) {
	    throw new RuntimeException("Impossible to complete the operation due to an unknown internal error.", e);
	}
    }
    
    public static void forceElementsLoad(WebDriver driver ) {
	log.trace("::forceElementsLoad(parameter) - Start: ");
	try {
	    synchronized (driver){
		WebDriverUtils util = new WebDriverUtils(driver);
		List<WebElement> webChamps=driver.findElements(By.xpath("//a//*[contains(@class, 'champion-name')]"));
		List<WebElement> webChamps2;
		do{
		    do{
			webChamps=driver.findElements(By.xpath("//a//*[contains(@class, 'champion-name')]"));
			try{
			    Thread.sleep(400);
			    util.clickXpath("//div[contains(@class,\"counters-list best-win-rate\")]//div[contains(@class,\"view-more-btn btn-gray\")]",0);
			    Thread.sleep(250);
			    util.clickXpath("//div[contains(@class,\"counters-list best-win-rate\")]//div[contains(@class,\"view-more-btn btn-gray\")]",0);
			    Thread.sleep(250);
			    util.clickXpath("//div[contains(@class,\"counters-list best-win-rate\")]//div[contains(@class,\"view-more-btn btn-gray\")]",0);
			}catch(Exception ex){}
			webChamps2=driver.findElements(By.xpath("//a//*[contains(@class, 'champion-name')]"));
		    }while(webChamps.size()!=webChamps2.size());
		    try{
			webChamps=driver.findElements(By.xpath("//a//*[contains(@class, 'champion-name')]"));
			Thread.sleep(800);
			util.clickXpath("//div[contains(@class,\"counters-list best-win-rate\")]//div[contains(@class,\"view-more-btn btn-gray\")]",0);
			Thread.sleep(250);
			util.clickXpath("//div[contains(@class,\"counters-list best-win-rate\")]//div[contains(@class,\"view-more-btn btn-gray\")]",0);
		    }catch(Exception ex){}
		    webChamps2=driver.findElements(By.xpath("//a//*[contains(@class, 'champion-name')]"));
		}while(webChamps.size()!=webChamps2.size());
		
		log.trace("::forceElementsLoad(parameter) - Finish: ");
	    }
	} catch (Exception e) {
	    throw new RuntimeException("Impossible to complete the operation due to an unknown internal error.", e);
	}
    }
    
    
    public void mapLaneCounters(Patch patch,UggRank rank, Champion champ,Role role,List<WebElement> webLaneCounters, List<WebElement> webGoldDiferences, List<WebElement> webMatchTotalGames) {
	log.trace("::mapLaneCounters(parameter) - Start: ");
	notNullValidation(champ,role,webLaneCounters,webGoldDiferences,webMatchTotalGames);
	List<Integer> webGoldIntDiferences=removeBlanksOnGlodDif(webGoldDiferences);
	if(webLaneCounters.size()!=webGoldDiferences.size() || webGoldDiferences.size()!=webMatchTotalGames.size()) 
	    throw new IllegalArgumentException("webLaneCounters,webGoldDiferences or webGoldDifTotalGames lists sizes differ");
	try {
	    
	    if(laneCounters==null) laneCounters=new ArrayList<>();
	    
	    for (int i = 0; i < webLaneCounters.size(); i++) {
		Integer webGoldIntDiference=webGoldIntDiferences.get(i);
		
		if(webGoldIntDiference>0){
		    WebElement webLaneCounter=webLaneCounters.get(i);
		    WebElement webMatchTotalGame=webMatchTotalGames.get(i);
		    laneCounters.add(new LaneCounter(patchRankRepository.getOrCreate(patch, rank), champ, role, 
			    getChampionWithName(webLaneCounter.getText()), 
			    webGoldIntDiference, 
			    Integer.parseInt(webMatchTotalGame.getText().replace(" games", "").replace(",", ""))));
		}
	    }
	    
	    log.trace("::mapLaneCounters(parameter) - Finish: ");
	    
	} catch (Exception e) {
	    throw new RuntimeException("Impossible to complete the operation due to an unknown internal error.", e);
	}
    }
    
    
    private static Champion getChampionWithName(String champName) {
	log.trace("::getChampionWithName(parameter) - Start: ");
	notNullValidation(champName);
	try {
	    for(Champion champ:ChampionExtractor.champs){
		if(champ.getName().equals(champName)) return champ;
	    }
	    
	    log.trace("::getChampionWithName(parameter) - Finish: ");
	    throw new RuntimeException("Could not obtain the champion with the specified name");
	} catch (Exception e) {
	    throw new RuntimeException("Impossible to complete the operation due to an unknown internal error.", e);
	}
    }

    private void mapCounters(Patch patch,UggRank rank,Champion champ, Role role, List<WebElement> webCounters, List<WebElement> webWinrates, List<WebElement> webWinratesTotalGames) {
	log.trace("::mapCounters(patch,champ,rol,webCounters,webWinrates,webWinratesTotalGames) - Start: ");
	notNullValidation(champ,role,webCounters,webWinrates,webWinratesTotalGames);
	if(webCounters.size()!=webWinrates.size() || webWinrates.size()!=webWinratesTotalGames.size()) 
	    throw new IllegalArgumentException("webLaneCounters,webGoldDiferences or webGoldDifTotalGames lists sizes differ");
	try {
	    
	    if(counters==null) counters=new ArrayList<>();
	    
	    for (int i = 0; i < webCounters.size(); i++) {
		WebElement webWinrate=webWinrates.get(i);
		Double winrate=Double.parseDouble(webWinrate.getText().replace("% WR", ""));
		if(winrate>50){
		    WebElement webCounter=webCounters.get(i);
		    WebElement webWinrateTotalGames=webWinratesTotalGames.get(i);
		    Counter counter=new Counter(patchRankRepository.getOrCreate(patch, rank), champ, role, 
			    getChampionWithName(webCounter.getText()), 
			    winrate, 
			    Integer.parseInt(webWinrateTotalGames.getText().replace(",", "").replace(" games", "")));
		    counters.add(counter);
		}
	    }
	    
    	    log.trace("::mapCounters(patch,champ,rol,webCounters,webWinrates,webWinratesTotalGames) - Finish: ");
	} catch (Exception e) {
	    throw new RuntimeException("Impossible to complete the operation due to an unknown internal error.", e);
	}
    }

    private static List<Integer> removeBlanksOnGlodDif(List<WebElement> webGoldDiferences) {
	log.trace("::removeBlanksOnGlodDif(parameter) - Start: ");
	notNullValidation(webGoldDiferences);
	try {
	    List<Integer> newWebGoldDiferences= new ArrayList<>();
	    for(WebElement webGoldDiference:webGoldDiferences){
		if(!webGoldDiference.getText().isBlank()){
		    
		    newWebGoldDiferences.add(Integer.parseInt(webGoldDiference.getText().replace(" GD15", "")));
		}
	    }
	    
	    log.trace("::removeBlanksOnGlodDif(parameter) - Finish: ");
	    return newWebGoldDiferences;
	    
	} catch (Exception e) {
	    throw new RuntimeException("Impossible to complete the operation due to an unknown internal error.", e);
	}
    }


    public static void loadChampionCounterWebpage(CountersSearch counterSearch, Role role) {
	log.trace("::loadChampionCounterWebpage(counterSearch,role) - Start: ");
	notNullValidation(counterSearch, role);
	try {
	    
	    Patch patch=counterSearch.patchRank.patch;
	    UggRank rank=counterSearch.patchRank.rank;
	    Champion champ=counterSearch.champ;
	    WebDriver driver=counterSearch.utils.driver;
	    
	    if(champ!=null && lastCounterSearch!=null && champ.equals(lastCounterSearch.champ)){
		try{
		    if(patch!=null && patch.equals(lastCounterSearch.patchRank.patch)){
			if(rank!=null && !rank.equals(lastCounterSearch.patchRank.rank))  changeRankTo(rank,driver);
			changeRoleTo(role,driver);
		    }else{//patch, role and rank changed
			if(rank!=null && !rank.equals(lastCounterSearch.patchRank.rank)) changeRankTo(rank,driver);
			changeRoleTo(role,driver);
			changePatchTo(patch,driver);
		    }
		}catch(Exception e){
		    log.warn("::loadChampionCounterWebpage(counterSearch,role): Error navigating throught the webpage. Last-search ["+lastCounterSearch+"] new-Search ["+counterSearch+"].");
		    driver.get(getChampionCounterURL(champ,patch,rank,role));
		}
	    }else{
		driver.get(getChampionCounterURL(champ,patch,rank,role));
	    }
	    
	    
	    lastCounterSearch=counterSearch;
	    log.trace("::loadChampionCounterWebpage(counterSearch,role) - Finish: URL must be oppened at this point");
	} catch (Exception e) {
	    throw new RuntimeException("Impossible to complete the operation due to an unknown internal error.", e);
	}
    }
    
    /**
     * Obtains the Champion URL with the given champion parameters.
     * It requires the entire description of the search so it can provide the {@link String} back to the caller.
     * 
     * @author <a href='mailto:obed.vazquez@gmail.com'>Obed Vazquez</a>
     * @since 2020-01-25
     * @param champion {@link Champion} to perform the operation with.
     * @param patch
     * @param rank
     * @param role
     * @return returned {@link String} with the final URL loaded.
     * @throws IllegalArgumentException - if the provided parameter is null.
     */
    public static String getChampionCounterURL(Champion champion, Patch patch, UggRank rank,Role role) {
	log.trace("::getChampionCounterURL(champion,patch,rank,role) - Start: ");
	notNullValidation(champion,patch,rank,role);
	try{
	    
	    String counterURL="https://u.gg/lol/champions/"+champion.getUggURLName()+"/counter?"+
		    "patch="+patch.getIdURLFormatted()+
		    "&rank="+rank.getUggName()+
		    "&role="+role.getName().toLowerCase();

	    log.trace("::getChampionCounterURL(champion,patch,rank,role) - Finish: ");
	    return counterURL;
	    
	} catch (Exception e) {
            throw new RuntimeException("Impossible to complete the operation due to an unknown internal error.", e);
        }
    }
    
    private static void changeRoleTo(Role role, WebDriver driver) {
	log.trace("::changeRoleTo(role,driver) - Start: ");
	notNullValidation(role,driver);
	try {
	    WebDriverUtils util= new WebDriverUtils(driver);
	    util.pageUp();
	    Long wait=100l;
	    util.waitFor(wait);
	    util.pageUp();
	    util.waitFor(wait);
	    util.pageUp();
	    util.getElementsByClassName("role-filter").get(Integer.parseInt(role.getUGGSelectorXpath())).click();
	    
	    log.trace("::changeRoleTo(parameter) - Finish: ");
	} catch (Exception e) {
	    log.error("::changeRoleTo(role,driver): Couldn't click on the new Role: "+role.getName());
	    throw new RuntimeException("Impossible to complete the operation due to an unknown internal error.", e);
	}
    }

    private static void changeRankTo(UggRank rank, WebDriver driver) {
	log.trace("::changeRankTo(rank,driver) - Start: ");
	notNullValidation(rank,driver);
	try {
	    
	    
	    
	    WebDriverUtils util = new WebDriverUtils(driver);
	    driver.findElements(By.className("filter-select_rank")).get(1).click(); //Click on Rank Button
//	    driver.findElement(By.xpath("//span[text() = '"+rank.printableName+"']")).click(); //click on the selected rank
//	    util.clickLinkText(rank.printableName);
	    util.clickText(rank.getPrintableName());
	    
	    log.trace("::changeRankTo(rank,driver) - Finish: ");
	} catch (Exception e) {
	    log.error("::changeRankTo(rank,driver): Couldn't click on the new rank: "+rank);
	    throw new RuntimeException("Impossible to complete the operation due to an unknown internal error.", e);
	}
    }


    private static void changePatchTo(Patch patch, WebDriver driver) {
	log.trace("::changePatchTo(patch,driver) - Start: ");
	notNullValidation(patch,driver);
	try {
	    
	    WebDriverUtils util = new WebDriverUtils(driver);
	    try{
		WebElement moreButton=util.getElementByXPath("//div[contains(@class,'filter-collapse')]//*[contains(text(),'More')]",false);// Grab "More" Button
		if(moreButton!=null) moreButton.click();// Click "More" Button
	    }catch(Exception ex){ } 
	    
	    util.clickClass("Select-value-label");// click patch Button
//	    util.clickXpath("//div[contains(@class,'default-select filter-select patch css-0')]"); //click on patches button
	    
//	    util.clickXpath("//div[contains(text(), '"+patch.getId()+"')]"); //Click on the patch number 
//	    util.clickText(patch.getId());
	    util.clickXpath("//div[contains(@class,'default-select__menu-list')]//*[contains(text(),'"+patch.getId()+"')]"); //click selected patch number
//	    driver.findElement(By.xpath("//*[contains(text(),'"+patch.getId()+"')]")).click();
	    

	    log.trace("::changePatchTo(patch,driver) - Finish: ");
	} catch (Exception e) {
	    log.error("::changePatchTo(patch,driver): Couldn't click on the new patch: "+patch);
	    throw new RuntimeException("Impossible to complete the operation due to an unknown internal error.", e);
	}
    }
    
}
