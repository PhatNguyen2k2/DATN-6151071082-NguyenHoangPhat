CREATE TABLE "COUNTRY" (
  "countryId" numeric(10,0) PRIMARY KEY NOT NULL,
  "countryName" text
);

CREATE TABLE "PROVINCE" (
  "provinceId" numeric(10,0) PRIMARY KEY NOT NULL,
  "countryId" numeric(10,0) NOT NULL,
  "provinceName" text
);

CREATE TABLE "DISTRICT" (
  "districtId" numeric(10,0) PRIMARY KEY NOT NULL,
  "provinceId" numeric(10,0) NOT NULL,
  "districtName" text
);

CREATE TABLE "WARD" (
  "wardId" numeric(10,0) PRIMARY KEY NOT NULL,
  "districtId" numeric(10,0) NOT NULL,
  "wardName" text
);

CREATE TABLE "ADDRESS" (
  "addressId" numeric(10,0) PRIMARY KEY NOT NULL,
  "wardId" numeric(10,0) NOT NULL,
  "addressDetail" text,
  "isLast" boolean
);

CREATE TABLE "STORETYPE" (
  "storeTypeId" numeric(10,0) PRIMARY KEY NOT NULL,
  "storeTypeName" text
);

CREATE TABLE "STORE" (
  "storeId" numeric(10,0) PRIMARY KEY NOT NULL,
  "storeName" text,
  "storeTypeId" numeric(10,0) NOT NULL,
  "addressId" numeric(10,0) NOT NULL,
  "coordinationStore" numeric(10,0)
);

CREATE TABLE "PARTNERTYPE" (
  "partnerTypeId" numeric(10,0) PRIMARY KEY NOT NULL,
  "partnerTypeName" text
);

CREATE TABLE "PARTNER" (
  "partnerId" numeric(10,0) PRIMARY KEY NOT NULL,
  "partnerTypeId" numeric(10,0) NOT NULL,
  "partnerName" text
);

CREATE TABLE "CUSTOMER" (
  "customerId" numeric(10,0) PRIMARY KEY NOT NULL,
  "customerName" text,
  "addressId" numeric(10,0) NOT NULL,
  "phone" varchar
);

CREATE TABLE "MAINGROUP" (
  "mainGroupId" numeric(10,0) PRIMARY KEY NOT NULL,
  "mainGroupName" text
);

CREATE TABLE "SUBGROUP" (
  "subGroupId" numeric(10,0) PRIMARY KEY NOT NULL,
  "mainGroupId" numeric(10,0) NOT NULL,
  "subGroupName" text
);

CREATE TABLE "PRODUCT" (
  "productId" numeric(10,0) PRIMARY KEY NOT NULL,
  "productname" text,
  "productlength" numeric(10,2),
  "productwidth" numeric(10,2),
  "productheight" numeric(10,2),
  "productsize" numeric(10,2),
  "productweight" numeric(10,2),
  "isfragile" boolean,
  "subgroupid" numeric(10,0) NOT NULL,
  "specification" numeric(10,2)
);

CREATE TABLE "GROUP_PRODUCT_ALLOW_TRANSPORT" (
  "partnerId" numeric(10,0) NOT NULL,
  "subGroupId" numeric(10,0) NOT NULL,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean,
  PRIMARY KEY ("partnerId", "subGroupId")
);

CREATE TABLE "TRANSPORT_FORM" (
  "transportFormId" numeric(10,0) PRIMARY KEY NOT NULL,
  "transportFormName" text,
  "description" text,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "ROUTE" (
  "routeId" numeric(10,0) PRIMARY KEY NOT NULL,
  "beginTime" timestamp,
  "endTime" timestamp,
  "beginAddress" numeric(10,0) NOT NULL,
  "endAddress" numeric(10,0) NOT NULL,
  "routeLength" numeric(10,2),
  "vehicleTypeId" numeric(10,0) NOT NULL,
  "tranportFormId" numeric(10,0) NOT NULL,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "STOP_LOCATION" (
  "stopLocationId" numeric(10,0) PRIMARY KEY NOT NULL,
  "routeId" numeric(10,0) NOT NULL,
  "stopIndex" numeric(10,0),
  "stopAddress" numeric(10,0) NOT NULL,
  "expectedStopTime" timestamp,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "SERVICETYPE" (
  "serviceTypeId" numeric(10,0) PRIMARY KEY NOT NULL,
  "serviceTypeName" text,
  "description" text
);

CREATE TABLE "SERVICEORDER" (
  "serviceOrderId" numeric(10,0) PRIMARY KEY NOT NULL,
  "serviceTypeId" numeric(10,0) NOT NULL,
  "transportFormId" numeric(10,0) NOT NULL,
  "senderStoreId" numeric(10,0) NOT NULL,
  "receiveAddress" numeric(10,0) NOT NULL,
  "coordinatorStoreId" numeric(10,0) NOT NULL,
  "collectionMoney" numeric(10,2),
  "senderFullname" text,
  "senderPhonenumber" text,
  "receiverFullname" text,
  "receiverPhonenumber" text,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "STOP_LOCATION_SERVICE" (
  "stopLocationId" numeric(10,0) NOT NULL,
  "serviceOrderId" numeric(10,0) NOT NULL,
  "serviceTypeId" numeric(10,0) NOT NULL,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean,
  PRIMARY KEY ("stopLocationId", "serviceOrderId")
);

CREATE TABLE "ORDER" (
  "orderId" numeric(10,0) PRIMARY KEY NOT NULL,
  "orderName" text,
  "serviceOrderId" numeric(10,0) NOT NULL,
  "weight" numeric(10,2),
  "length" numeric(10,2),
  "width" numeric(10,2),
  "height" numeric(10,2),
  "note" text,
  "senderFullname" text,
  "senderPhonenumber" text,
  "senderAddress" numeric(10,0) NOT NULL,
  "receiverFullname" text,
  "receiverPhonenumber" text,
  "receiverAddress" numeric(10,0) NOT NULL,
  "addressDescriptionId" numeric(10,0) NOT NULL,
  "customerId" numeric(10,0) NOT NULL,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "ORDER_PRODUCT" (
  "orderId" numeric(10,0) NOT NULL,
  "productId" numeric(10,0) NOT NULL,
  "quantity" numeric(10,0),
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean,
  PRIMARY KEY ("orderId", "productId")
);

CREATE TABLE "PRODUCT_SERVICEORDER" (
  "productServiceOrderId" numeric(10,0) PRIMARY KEY NOT NULL,
  "productId" numeric(10,0) NOT NULL,
  "peopleRequire" numeric(10,0),
  "status" boolean,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "SPECIFIED_EMPLOYEE" (
  "specifiedEmployeeId" numeric(10,0) PRIMARY KEY NOT NULL,
  "employeeId" numeric(10,0),
  "description" text,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "SPECIAL_REQUEST" (
  "specialRequestId" numeric(10,0) PRIMARY KEY NOT NULL,
  "orderId" numeric(10,0) NOT NULL,
  "specifiedemployeeId" numeric(10,0),
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "ADDRESS_DESCRIPTION" (
  "addressDescriptionId" numeric(10,0) PRIMARY KEY NOT NULL,
  "fourLevelHouse" boolean,
  "highRiseHouse" boolean,
  "elevator" boolean,
  "stairWidth" numeric(10,2),
  "houseInAlley" boolean,
  "alleyWidth" numeric(10,2),
  "distanceToHouse" numeric(10,2),
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "CUSTOMER_REVIEW" (
  "customerReviewId" numeric(10,0) PRIMARY KEY NOT NULL,
  "customerId" numeric(10,0) NOT NULL,
  "orderId" numeric(10,0) NOT NULL,
  "point" numeric(10,0),
  "comment" text
);

CREATE TABLE "RULETYPE" (
  "ruleTypeId" numeric(10,0) PRIMARY KEY NOT NULL,
  "ruleTypeName" text
);

CREATE TABLE "RULE_GROUP" (
  "ruleGroupId" numeric(10,0) PRIMARY KEY NOT NULL,
  "ruleGroupName" text
);

CREATE TABLE "RULE" (
  "ruleId" numeric(10,0) PRIMARY KEY NOT NULL,
  "ruleName" text,
  "ruleTypeId" numeric(10,0) NOT NULL,
  "ruleGroupId" numeric(10,0) NOT NULL,
  "description" text,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "RULE_IN_USE" (
  "ruleInUseId" numeric(10,0) PRIMARY KEY NOT NULL,
  "ruleId" numeric(10,0) NOT NULL,
  "storeId" numeric(10,0) NOT NULL,
  "ruleName" text,
  "priorityIndex" numeric(10,0),
  "priorityPercentage" numeric(10,2),
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "TRANSPORT_SERVICE_PLAN" (
  "transportServicePlanId" numeric(10,0) PRIMARY KEY NOT NULL,
  "vehicleId" numeric(10,0),
  "routeId" numeric(10,0) NOT NULL,
  "vehicleTypeId" numeric(10,0),
  "employeeQuantity" numeric(10,0),
  "driverQuantity" numeric(10,0),
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "EMPLOYEE_TRANSPORT_SERVICE" (
  "employeeTransportServiceId" numeric(10,0) PRIMARY KEY NOT NULL,
  "EmployeeId" numeric(10,0),
  "position" text,
  "transportServicePlanId" numeric(10,0) NOT NULL,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "VEHICLE_BOOKING" (
  "vehicleBookingId" numeric(10,0) PRIMARY KEY NOT NULL,
  "partnerId" numeric(10,0),
  "vehicleId" numeric(10,0),
  "vehicleTypeId" numeric(10,0),
  "createTime" timestamp,
  "respondTime" timestamp,
  "fee" numeric(10,2),
  "status" text,
  "rentalForm" text,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "VEHICLE_BOOKING_ROUTE" (
  "routeId" numeric(10,0) NOT NULL,
  "vehicleBookingId" numeric(10,0) NOT NULL,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean,
  PRIMARY KEY ("routeId", "vehicleBookingId")
);

CREATE TABLE "EMPLOYEE_BOOKING" (
  "employeeBookingId" numeric(10,0) PRIMARY KEY NOT NULL,
  "routeId" numeric(10,0) NOT NULL,
  "partnerId" numeric(10,0) NOT NULL,
  "employeeId" numeric(10,0),
  "position" text,
  "createTime" timestamp,
  "respondTime" timestamp,
  "fee" numeric(10,2),
  "status" text,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "IMPLEMENT_TRANSPORTATION" (
  "implementTransportationId" numeric(10,0) PRIMARY KEY NOT NULL,
  "transportServicePlanId" numeric(10,0) NOT NULL,
  "totalCost" numeric(10,2),
  "status" text,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "REAL_STOP_LOCATION" (
  "realStopLocationId" numeric(10,0) PRIMARY KEY NOT NULL,
  "routeId" numeric(10,0) NOT NULL,
  "stopIndex" numeric(10,0),
  "stopAddress" numeric(10,0) NOT NULL,
  "realStopTime" timestamp,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "REAL_DESTINATION_SERVICE" (
  "realStopLocationId" numeric(10,0) NOT NULL,
  "serviceOrderId" numeric(10,0) NOT NULL,
  "serviceTypeId" numeric(10,0) NOT NULL,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean,
  PRIMARY KEY ("realStopLocationId", "serviceOrderId")
);

CREATE TABLE "INCIDENTTYPE" (
  "incidentTypeId" numeric(10,0) PRIMARY KEY NOT NULL,
  "incidentTypeName" text
);

CREATE TABLE "INCIDENT" (
  "incidentId" numeric(10,0) PRIMARY KEY NOT NULL,
  "incidentTypeId" numeric(10,0) NOT NULL,
  "description" text,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "INCIDENT_RECORDATION" (
  "incidentId" numeric(10,0) NOT NULL,
  "implementTranportationId" numeric(10,0) NOT NULL,
  "description" text,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean,
  PRIMARY KEY ("incidentId", "implementTranportationId")
);

CREATE TABLE "EMPLOYEE" (
  "employeeId" numeric(10,0) PRIMARY KEY,
  "storeId" numeric(10,0),
  "employeeName" text,
  "addressId" numeric(10,0),
  "phoneNumber" text,
  "gender" boolean,
  "partnerId" numeric(10,0),
  "isActive" boolean
);

CREATE TABLE "CATEGORY_SKILL" (
  "categorySkillId" numeric(10,0) PRIMARY KEY,
  "serviceTypeId" numeric(10,0),
  "categoryName" text,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "SKILL" (
  "skillId" numeric(10,0) PRIMARY KEY,
  "skillName" text,
  "categorySkillId" numeric(10,0),
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "SKILL_LEVEL" (
  "skillLevelId" numeric(10,0) PRIMARY KEY,
  "skillLevelName" text,
  "isActive" boolean
);

CREATE TABLE "EMPLOYEE_SKILL" (
  "employeeSkillId" numeric(10,0) PRIMARY KEY,
  "employeeId" numeric(10,0),
  "skillId" numeric(10,0),
  "skillLevelId" numeric(10,0),
  "isActive" boolean,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "SKILL_SUBGROUP" (
  "skillId" numeric(10,0),
  "subGroupId" numeric(10,0),
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean,
  PRIMARY KEY ("skillId", "subGroupId")
);

CREATE TABLE "RATING_EMPLOYEE_SKILL" (
  "raingEmployeeId" numeric(10,0) PRIMARY KEY,
  "employeeId" numeric(10,0),
  "skillId" numeric(10,0),
  "value" numeric(10,1),
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "EVERAGE_CUSTOMER_RATING" (
  "employeeId" numeric(10,0),
  "updateTime" timestamp,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean,
  PRIMARY KEY ("employeeId", "updateTime")
);

CREATE TABLE "SHIFT" (
  "shiftId" numeric(10,0) PRIMARY KEY,
  "storeId" numeric(10,0),
  "shiftName" text,
  "shiftNumber" numeric(1,0),
  "timeStart" time,
  "timeEnd" time
);

CREATE TABLE "EMPLOYEE_SHIFT" (
  "employeeShiftId" numeric(10,0) PRIMARY KEY,
  "employeeId" numeric(10,0),
  "shiftId" numeric(10,0),
  "workingDate" date,
  "loadApply" boolean
);

CREATE TABLE "DEBT_DETAIL" (
  "debtDetailId" numeric(10,0) PRIMARY KEY,
  "employeeId" numeric(10,0),
  "carrierTypeId" numeric(10,0),
  "CODfee" numeric(15,0),
  "serviceOrderId" numeric(10,0),
  "amountPaid" numeric(15,0),
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "LIMIT_DEBT" (
  "limitDebtId" numeric(10,0) PRIMARY KEY,
  "employeeId" numeric(10,0),
  "carrierTypeId" numeric(10,0),
  "limitDebtValue" numeric(15,0)
);

CREATE TABLE "CURRENT_DEBT" (
  "currentDebtId" numeric(10,0) PRIMARY KEY,
  "employeeId" numeric(10,0),
  "carrierTypeId" numeric(10,0),
  "totalDebt" numeric(15,0),
  "updateTime" timestamp,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "EMPLOYEE_REQUESTPERMONTH" (
  "employeeRequestPerMonthId" numeric(10,0) PRIMARY KEY,
  "employeeId" numeric(10,0),
  "year" numeric(4,0),
  "month" numeric(2,0),
  "totalRequest" numeric(4,0),
  "totalRejectRequest" numeric(4,0),
  "totalExpire" numeric(4,0)
);

CREATE TABLE "EMPLOYEE_LOAD" (
  "employeeLoadId" numeric(10,0) PRIMARY KEY,
  "subGroupId" numeric(10,0),
  "shiftId" numeric(10,0),
  "skillId" numeric(10,0),
  "totalLoad" numeric(4,0),
  "loadUsed" numeric(4,0),
  "loadRemaining" numeric(4,0),
  "dateApply" date,
  "storeId" numeric(10,0),
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "EMPLOYEE_AGREEMENT_TYPE" (
  "employeeAgreementTypeId" numeric(10,0) PRIMARY KEY,
  "employeeAgreementTypeName" text,
  "isActive" boolean
);

CREATE TABLE "EMPLOYEE_AGREEMENT" (
  "employeeAgreementId" numeric(10,0) PRIMARY KEY,
  "partnerId" numeric(10,0),
  "serviceTypeId" numeric(10,0),
  "storeId" numeric(10,0),
  "employeeAgreementTypeID" numeric(10,0),
  "employeeId" numeric(10,0),
  "agreementName" text,
  "signDate" date,
  "effectDate" date,
  "expireDate" date,
  "isExtend" boolean,
  "isLiquidation" boolean,
  "liquidationDate" date,
  "minimumServiceOrder" numeric(4,0),
  "agreementCanceled" boolean,
  "partnerCapacity" numeric(3,0),
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "RESOURCE_PRICE" (
  "resourcePriceId" numeric(10,0) PRIMARY KEY,
  "resourcePriceName" text,
  "serviceTypeId" numeric(10,0),
  "mainGroupId" numeric(10,0),
  "subGroupId" numeric(10,0),
  "specificationsFrom" numeric(5,0),
  "specificationsTo" numeric(5,0),
  "cost" numeric(15,0),
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "RESOURCE_PRICE_APPLY" (
  "listPriceApplyId" numeric(10,0) PRIMARY KEY,
  "employeeAgreementId" numeric(10,0),
  "resourcePriceId" numeric(10,0),
  "isAnnual" boolean,
  "fromDate" date,
  "toDate" date,
  "isActive" boolean,
  "priority" numeric(2,0),
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "BOOKING_PERCENT" (
  "bookingPercentId" numeric(10,0) PRIMARY KEY,
  "employeeAgreementTypeId" numeric(10,0),
  "storeId" numeric(10,0),
  "percent" numeric(3,0),
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "DRIVER_RESOURCE" (
  "driverResourceId" numeric(10,0) PRIMARY KEY,
  "vehicleTypeId" numeric(10,0),
  "driverNumber" numeric(4,0),
  "employeeAgreementId" numeric(10,0),
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "DRIVER_PRICE_DETAIL" (
  "driverPriceDetailId" numeric(10,0) PRIMARY KEY,
  "vehicleTypeId" numeric(10,0),
  "employeeAgreementId" numeric(10,0),
  "storeId" numeric(10,0),
  "price" numeric(15,0),
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "MAX_DRIVING_TIME" (
  "maxDrivingTimeId" numeric(10,0) PRIMARY KEY NOT NULL,
  "storeId" numeric(10,0) NOT NULL,
  "maximumTime" timestamp,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "DRIVING_HOUR_INFO" (
  "drivingHourInfoId" numeric(10,0) PRIMARY KEY NOT NULL,
  "employeeId" numeric(10,0),
  "maxDrivingTimeId" numeric(10,0),
  "hourDriven" timestamp,
  "hourLeft" timestamp,
  "day" date,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "EMPLOYEE_VIOLATE_INFO" (
  "employeeViolateInfoId" numeric(10,0) PRIMARY KEY,
  "storeId" numeric(10,0),
  "numOfReject" numeric(10,0),
  "numOfExpire" numeric(10,0),
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "CARRIERTYPE" (
  "carrierTypeId" numeric(10,0) PRIMARY KEY NOT NULL,
  "carrierName" text
);

CREATE TABLE "VEHICLEGROUP" (
  "vehicleGroupId" numeric(10,0) PRIMARY KEY NOT NULL,
  "vehicleGroupName" text
);

CREATE TABLE "VEHICLETYPE" (
  "vehicleTypeId" numeric(10,0) PRIMARY KEY NOT NULL,
  "carrierTypeId" numeric(10,0) NOT NULL,
  "vehicleGroupId" numeric(10,0) NOT NULL,
  "length" numeric(10,2),
  "weight" numeric(10,2),
  "width" numeric(10,2),
  "height" numeric(10,2),
  "volume" numeric(10,2)
);

CREATE TABLE "VEHICLE" (
  "vehicleId" numeric(10,0) PRIMARY KEY NOT NULL,
  "vehicleName" text,
  "licensePlates" text,
  "vehicleTypeId" numeric(10,0) NOT NULL,
  "partnerId" numeric(10,0)
);

CREATE TABLE "SKILL_BY_VEHICLETYPE" (
  "vehicleTypeId" numeric(10,0) NOT NULL,
  "skillId" numeric(10,0) NOT NULL,
  PRIMARY KEY ("vehicleTypeId", "skillId")
);

CREATE TABLE "VEHICLE_BAN_SCHEDULE" (
  "vehicleBanScheduleId" numeric(10,0) PRIMARY KEY NOT NULL,
  "AreaId" numeric(10,0),
  "vehicleTypeId" numeric(10,0) NOT NULL,
  "beginTime" timestamp,
  "startEnd" timestamp,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "LOAD_DEVIATION" (
  "storeId" numeric(10,0) NOT NULL,
  "deviatePercent" numeric(10,0) NOT NULL,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean,
  PRIMARY KEY ("storeId", "deviatePercent")
);

CREATE TABLE "VEHICLE_LOAD_TYPE" (
  "loadVehicleTypeId" numeric(10,0) PRIMARY KEY NOT NULL,
  "workingShift" text,
  "vehicleLoad" text,
  "usedVehicleLoad" text,
  "residualVehicleLoad" text,
  "day" timestamp,
  "vehicleTypeID" numeric(10,0) NOT NULL,
  "storeId" numeric(10,0),
  "partnerId" numeric(10,0),
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "VEHICLE_LOAD_IN_DAY" (
  "vehicleLoadInDayId" numeric(10,0) PRIMARY KEY NOT NULL,
  "workingShift" text,
  "vehicleLoad" boolean,
  "day" timestamp,
  "vehicleId" numeric(10,0) NOT NULL,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "VEHICLE_BOOKING_RATE" (
  "vehicleBookingRateId" numeric(10,0) PRIMARY KEY NOT NULL,
  "StoreId" numeric(10,0),
  "partnerId" numeric(10,0),
  "bookingRate" numeric(10,2),
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "VEHICLE_RENTAL_AGREEMENT_TYPE" (
  "vehicleRentalAgreementTypeId" numeric(10,0) PRIMARY KEY NOT NULL,
  "vehicleRentalAgreementTypeName" text,
  "isActive" boolean
);

CREATE TABLE "VEHICLE_AGREEMENT" (
  "vehicleAgreementId" numeric(10,0) PRIMARY KEY NOT NULL,
  "vehicleAgreementName" text,
  "storeId" numeric(10,0),
  "vehicleRentalAgreementTypeId" numeric(10,0) NOT NULL,
  "partnerId" numeric(10,0),
  "effectiveDate" timestamp,
  "agreementExpirationDate" timestamp,
  "agreementExtended" boolean,
  "extensionToDate" timestamp,
  "agreementHasBeenLiquidated" boolean,
  "agreementLiquidationDate" timestamp,
  "agreementCanceled" boolean,
  "maximumNumberOfViolations" numeric(10,0),
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "SERVICE_PRICE" (
  "servicePriceId" numeric(10,0) PRIMARY KEY NOT NULL,
  "beginLocation" numeric(10,0),
  "endLocation" numeric(10,0),
  "MOQ" numeric(10,0),
  "vehicleTypeId" numeric(10,0) NOT NULL,
  "costOfDay" numeric(10,2),
  "vehicleAgreementId" numeric(10,0) NOT NULL,
  "chargeType" numeric(10,0),
  "loadingFee" numeric(10,2),
  "holidayFee" numeric(10,2),
  "nightFee" numeric(10,2),
  "addingStopLocationFee" numeric(10,2),
  "waitingTimeFee" numeric(10,2),
  "tolls" numeric(10,2),
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "FEEONKILOMETERS" (
  "feeOnKilometerId" numeric(10,0) PRIMARY KEY NOT NULL,
  "start" numeric(10,0),
  "end" numeric(10,0),
  "cost" numeric(10,2),
  "servicePriceId" numeric(10,0) NOT NULL,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "TRANSPORT_RESOURCE" (
  "transportResourceId" numeric(10,0) PRIMARY KEY NOT NULL,
  "vehicleTypeId" numeric(10,0) NOT NULL,
  "numOfVehicleCanProvideInDay" numeric(10,0),
  "vehicleAgreementId" numeric(10,0) NOT NULL,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "FEE_BY_TRANSPORT_FORM" (
  "feeByTransportFormId" numeric(10,0) PRIMARY KEY NOT NULL,
  "transportFormId" numeric(10,0) NOT NULL,
  "cost" numeric(10,2),
  "servicePriceId" numeric(10,0) NOT NULL,
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "FEE_BY_BOOKING_DAY" (
  "vehicleAgreementId" numeric(10,0),
  "vehicleTypeId" numeric(10,0),
  "cost" numeric(10,2),
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean,
  PRIMARY KEY ("vehicleAgreementId", "vehicleTypeId")
);

CREATE TABLE "PARTNER_REQUESTPERMONTH" (
  "partnerRequestPerMonthId" numeric(10,0) PRIMARY KEY,
  "partnerId" numeric(10,0),
  "storeId" numeric(10,0),
  "year" numeric(4,0),
  "month" numeric(2,0),
  "totalRequest" numeric(4,0),
  "totalRejectRequest" numeric(4,0),
  "totalExpire" numeric(4,0),
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "AGREEMENT_VIOLATE_INFO" (
  "agreementViolateInfoId" numeric(10,0) PRIMARY KEY NOT NULL,
  "vehicleAgreementId" numeric(10,0) NOT NULL,
  "numOfViolate" numeric(10,0),
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

CREATE TABLE "VEHICLE_BOOKING_EXPIRATION" (
  "vehicleBookingExpirationId" numeric(10,0) PRIMARY KEY NOT NULL,
  "expireTime" timestamp,
  "storeId" numeric(10,0),
  "createdUser" numeric(10,0),
  "createdDate" timestamp,
  "updatedUser" numeric(10,0),
  "updatedDate" timestamp,
  "deletedUser" numeric(10,0),
  "deletedDate" timestamp,
  "updateNote" text,
  "isLast" boolean
);

COMMENT ON COLUMN "TRANSPORT_FORM"."transportFormName" IS '1 - vận chuyển nhanh 
2 - vận chuyển thường';

COMMENT ON COLUMN "RULETYPE"."ruleTypeName" IS 'must/may';

COMMENT ON COLUMN "RULE_GROUP"."ruleGroupName" IS 'Xe/Nhân viên/Tài xế';

COMMENT ON COLUMN "VEHICLE_BOOKING"."status" IS '(khởi tạo, không tìm được xe, chờ duyệt, đã duyệt, từ chối, hết hạn)';

COMMENT ON COLUMN "VEHICLE_BOOKING"."rentalForm" IS '(1-chuyến, 2-ngày)';

COMMENT ON COLUMN "EMPLOYEE_BOOKING"."status" IS '(khởi tạo, chờ duyệt, đã duyệt, từ chối, hết hạn)';

COMMENT ON COLUMN "IMPLEMENT_TRANSPORTATION"."status" IS '(Thành công, Thất bại, Chờ)';

ALTER TABLE "PROVINCE" ADD FOREIGN KEY ("countryId") REFERENCES "COUNTRY" ("countryId");

ALTER TABLE "DISTRICT" ADD FOREIGN KEY ("provinceId") REFERENCES "PROVINCE" ("provinceId");

ALTER TABLE "WARD" ADD FOREIGN KEY ("districtId") REFERENCES "DISTRICT" ("districtId");

ALTER TABLE "ADDRESS" ADD FOREIGN KEY ("wardId") REFERENCES "WARD" ("wardId");

ALTER TABLE "STORE" ADD FOREIGN KEY ("storeTypeId") REFERENCES "STORETYPE" ("storeTypeId");

ALTER TABLE "STORE" ADD FOREIGN KEY ("addressId") REFERENCES "ADDRESS" ("addressId");

ALTER TABLE "STORE" ADD FOREIGN KEY ("coordinationStore") REFERENCES "STORE" ("storeId");

ALTER TABLE "PARTNER" ADD FOREIGN KEY ("partnerTypeId") REFERENCES "PARTNERTYPE" ("partnerTypeId");

ALTER TABLE "CUSTOMER" ADD FOREIGN KEY ("addressId") REFERENCES "ADDRESS" ("addressId");

ALTER TABLE "SUBGROUP" ADD FOREIGN KEY ("mainGroupId") REFERENCES "MAINGROUP" ("mainGroupId");

ALTER TABLE "PRODUCT" ADD FOREIGN KEY ("subgroupid") REFERENCES "SUBGROUP" ("subGroupId");

ALTER TABLE "GROUP_PRODUCT_ALLOW_TRANSPORT" ADD FOREIGN KEY ("partnerId") REFERENCES "PARTNER" ("partnerId");

ALTER TABLE "GROUP_PRODUCT_ALLOW_TRANSPORT" ADD FOREIGN KEY ("subGroupId") REFERENCES "SUBGROUP" ("subGroupId");

ALTER TABLE "ROUTE" ADD FOREIGN KEY ("beginAddress") REFERENCES "ADDRESS" ("addressId");

ALTER TABLE "ROUTE" ADD FOREIGN KEY ("endAddress") REFERENCES "ADDRESS" ("addressId");

ALTER TABLE "ROUTE" ADD FOREIGN KEY ("tranportFormId") REFERENCES "TRANSPORT_FORM" ("transportFormId");

ALTER TABLE "STOP_LOCATION" ADD FOREIGN KEY ("routeId") REFERENCES "ROUTE" ("routeId");

ALTER TABLE "STOP_LOCATION" ADD FOREIGN KEY ("stopAddress") REFERENCES "ADDRESS" ("addressId");

ALTER TABLE "SERVICEORDER" ADD FOREIGN KEY ("serviceTypeId") REFERENCES "SERVICETYPE" ("serviceTypeId");

ALTER TABLE "SERVICEORDER" ADD FOREIGN KEY ("transportFormId") REFERENCES "TRANSPORT_FORM" ("transportFormId");

ALTER TABLE "SERVICEORDER" ADD FOREIGN KEY ("senderStoreId") REFERENCES "STORE" ("storeId");

ALTER TABLE "SERVICEORDER" ADD FOREIGN KEY ("receiveAddress") REFERENCES "ADDRESS" ("addressId");

ALTER TABLE "SERVICEORDER" ADD FOREIGN KEY ("coordinatorStoreId") REFERENCES "STORE" ("storeId");

ALTER TABLE "STOP_LOCATION_SERVICE" ADD FOREIGN KEY ("stopLocationId") REFERENCES "STOP_LOCATION" ("stopLocationId");

ALTER TABLE "STOP_LOCATION_SERVICE" ADD FOREIGN KEY ("serviceOrderId") REFERENCES "SERVICEORDER" ("serviceOrderId");

ALTER TABLE "STOP_LOCATION_SERVICE" ADD FOREIGN KEY ("serviceTypeId") REFERENCES "SERVICETYPE" ("serviceTypeId");

ALTER TABLE "ORDER" ADD FOREIGN KEY ("serviceOrderId") REFERENCES "SERVICEORDER" ("serviceOrderId");

ALTER TABLE "ORDER" ADD FOREIGN KEY ("senderAddress") REFERENCES "ADDRESS" ("addressId");

ALTER TABLE "ORDER" ADD FOREIGN KEY ("receiverAddress") REFERENCES "ADDRESS" ("addressId");

ALTER TABLE "ORDER" ADD FOREIGN KEY ("addressDescriptionId") REFERENCES "ADDRESS_DESCRIPTION" ("addressDescriptionId");

ALTER TABLE "ORDER" ADD FOREIGN KEY ("customerId") REFERENCES "CUSTOMER" ("customerId");

ALTER TABLE "ORDER_PRODUCT" ADD FOREIGN KEY ("orderId") REFERENCES "ORDER" ("orderId");

ALTER TABLE "ORDER_PRODUCT" ADD FOREIGN KEY ("productId") REFERENCES "PRODUCT" ("productId");

ALTER TABLE "PRODUCT_SERVICEORDER" ADD FOREIGN KEY ("productId") REFERENCES "PRODUCT" ("productId");

ALTER TABLE "SPECIAL_REQUEST" ADD FOREIGN KEY ("orderId") REFERENCES "ORDER" ("orderId");

ALTER TABLE "SPECIAL_REQUEST" ADD FOREIGN KEY ("specifiedemployeeId") REFERENCES "SPECIFIED_EMPLOYEE" ("specifiedEmployeeId");

ALTER TABLE "CUSTOMER_REVIEW" ADD FOREIGN KEY ("customerId") REFERENCES "CUSTOMER" ("customerId");

ALTER TABLE "CUSTOMER_REVIEW" ADD FOREIGN KEY ("orderId") REFERENCES "ORDER" ("orderId");

ALTER TABLE "RULE" ADD FOREIGN KEY ("ruleTypeId") REFERENCES "RULETYPE" ("ruleTypeId");

ALTER TABLE "RULE" ADD FOREIGN KEY ("ruleGroupId") REFERENCES "RULE_GROUP" ("ruleGroupId");

ALTER TABLE "RULE_IN_USE" ADD FOREIGN KEY ("ruleId") REFERENCES "RULE" ("ruleId");

ALTER TABLE "RULE_IN_USE" ADD FOREIGN KEY ("storeId") REFERENCES "STORE" ("storeId");

ALTER TABLE "TRANSPORT_SERVICE_PLAN" ADD FOREIGN KEY ("routeId") REFERENCES "ROUTE" ("routeId");

ALTER TABLE "EMPLOYEE_TRANSPORT_SERVICE" ADD FOREIGN KEY ("transportServicePlanId") REFERENCES "TRANSPORT_SERVICE_PLAN" ("transportServicePlanId");

ALTER TABLE "VEHICLE_BOOKING" ADD FOREIGN KEY ("partnerId") REFERENCES "PARTNER" ("partnerId");

ALTER TABLE "VEHICLE_BOOKING_ROUTE" ADD FOREIGN KEY ("routeId") REFERENCES "ROUTE" ("routeId");

ALTER TABLE "VEHICLE_BOOKING_ROUTE" ADD FOREIGN KEY ("vehicleBookingId") REFERENCES "VEHICLE_BOOKING" ("vehicleBookingId");

ALTER TABLE "EMPLOYEE_BOOKING" ADD FOREIGN KEY ("routeId") REFERENCES "ROUTE" ("routeId");

ALTER TABLE "EMPLOYEE_BOOKING" ADD FOREIGN KEY ("partnerId") REFERENCES "PARTNER" ("partnerId");

ALTER TABLE "IMPLEMENT_TRANSPORTATION" ADD FOREIGN KEY ("transportServicePlanId") REFERENCES "TRANSPORT_SERVICE_PLAN" ("transportServicePlanId");

ALTER TABLE "REAL_STOP_LOCATION" ADD FOREIGN KEY ("routeId") REFERENCES "ROUTE" ("routeId");

ALTER TABLE "REAL_STOP_LOCATION" ADD FOREIGN KEY ("stopAddress") REFERENCES "ADDRESS" ("addressId");

ALTER TABLE "REAL_DESTINATION_SERVICE" ADD FOREIGN KEY ("realStopLocationId") REFERENCES "REAL_STOP_LOCATION" ("realStopLocationId");

ALTER TABLE "REAL_DESTINATION_SERVICE" ADD FOREIGN KEY ("serviceOrderId") REFERENCES "SERVICEORDER" ("serviceOrderId");

ALTER TABLE "REAL_DESTINATION_SERVICE" ADD FOREIGN KEY ("serviceTypeId") REFERENCES "SERVICETYPE" ("serviceTypeId");

ALTER TABLE "INCIDENT" ADD FOREIGN KEY ("incidentTypeId") REFERENCES "INCIDENTTYPE" ("incidentTypeId");

ALTER TABLE "INCIDENT_RECORDATION" ADD FOREIGN KEY ("incidentId") REFERENCES "INCIDENT" ("incidentId");

ALTER TABLE "INCIDENT_RECORDATION" ADD FOREIGN KEY ("implementTranportationId") REFERENCES "IMPLEMENT_TRANSPORTATION" ("implementTransportationId");

ALTER TABLE "EMPLOYEE" ADD FOREIGN KEY ("storeId") REFERENCES "STORE" ("storeId");

ALTER TABLE "EMPLOYEE" ADD FOREIGN KEY ("addressId") REFERENCES "ADDRESS" ("addressId");

ALTER TABLE "EMPLOYEE" ADD FOREIGN KEY ("partnerId") REFERENCES "PARTNER" ("partnerId");

ALTER TABLE "CATEGORY_SKILL" ADD FOREIGN KEY ("serviceTypeId") REFERENCES "SERVICETYPE" ("serviceTypeId");

ALTER TABLE "SKILL" ADD FOREIGN KEY ("categorySkillId") REFERENCES "CATEGORY_SKILL" ("categorySkillId");

ALTER TABLE "EMPLOYEE_SKILL" ADD FOREIGN KEY ("employeeId") REFERENCES "EMPLOYEE" ("employeeId");

ALTER TABLE "EMPLOYEE_SKILL" ADD FOREIGN KEY ("skillId") REFERENCES "SKILL" ("skillId");

ALTER TABLE "EMPLOYEE_SKILL" ADD FOREIGN KEY ("skillLevelId") REFERENCES "SKILL_LEVEL" ("skillLevelId");

ALTER TABLE "SKILL_SUBGROUP" ADD FOREIGN KEY ("skillId") REFERENCES "SKILL" ("skillId");

ALTER TABLE "SKILL_SUBGROUP" ADD FOREIGN KEY ("subGroupId") REFERENCES "SUBGROUP" ("subGroupId");

ALTER TABLE "RATING_EMPLOYEE_SKILL" ADD FOREIGN KEY ("employeeId") REFERENCES "EMPLOYEE" ("employeeId");

ALTER TABLE "RATING_EMPLOYEE_SKILL" ADD FOREIGN KEY ("skillId") REFERENCES "SKILL" ("skillId");

ALTER TABLE "EVERAGE_CUSTOMER_RATING" ADD FOREIGN KEY ("employeeId") REFERENCES "EMPLOYEE" ("employeeId");

ALTER TABLE "SHIFT" ADD FOREIGN KEY ("storeId") REFERENCES "STORE" ("storeId");

ALTER TABLE "EMPLOYEE_SHIFT" ADD FOREIGN KEY ("employeeId") REFERENCES "EMPLOYEE" ("employeeId");

ALTER TABLE "EMPLOYEE_SHIFT" ADD FOREIGN KEY ("shiftId") REFERENCES "SHIFT" ("shiftId");

ALTER TABLE "DEBT_DETAIL" ADD FOREIGN KEY ("employeeId") REFERENCES "EMPLOYEE" ("employeeId");

ALTER TABLE "DEBT_DETAIL" ADD FOREIGN KEY ("carrierTypeId") REFERENCES "CARRIERTYPE" ("carrierTypeId");

ALTER TABLE "DEBT_DETAIL" ADD FOREIGN KEY ("serviceOrderId") REFERENCES "SERVICEORDER" ("serviceOrderId");

ALTER TABLE "LIMIT_DEBT" ADD FOREIGN KEY ("employeeId") REFERENCES "EMPLOYEE" ("employeeId");

ALTER TABLE "LIMIT_DEBT" ADD FOREIGN KEY ("carrierTypeId") REFERENCES "CARRIERTYPE" ("carrierTypeId");

ALTER TABLE "CURRENT_DEBT" ADD FOREIGN KEY ("employeeId") REFERENCES "EMPLOYEE" ("employeeId");

ALTER TABLE "CURRENT_DEBT" ADD FOREIGN KEY ("carrierTypeId") REFERENCES "CARRIERTYPE" ("carrierTypeId");

ALTER TABLE "EMPLOYEE_REQUESTPERMONTH" ADD FOREIGN KEY ("employeeId") REFERENCES "EMPLOYEE" ("employeeId");

ALTER TABLE "EMPLOYEE_LOAD" ADD FOREIGN KEY ("subGroupId") REFERENCES "SUBGROUP" ("subGroupId");

ALTER TABLE "EMPLOYEE_LOAD" ADD FOREIGN KEY ("shiftId") REFERENCES "SHIFT" ("shiftId");

ALTER TABLE "EMPLOYEE_LOAD" ADD FOREIGN KEY ("skillId") REFERENCES "SKILL" ("skillId");

ALTER TABLE "EMPLOYEE_LOAD" ADD FOREIGN KEY ("storeId") REFERENCES "STORE" ("storeId");

ALTER TABLE "EMPLOYEE_AGREEMENT" ADD FOREIGN KEY ("partnerId") REFERENCES "PARTNER" ("partnerId");

ALTER TABLE "EMPLOYEE_AGREEMENT" ADD FOREIGN KEY ("serviceTypeId") REFERENCES "SERVICETYPE" ("serviceTypeId");

ALTER TABLE "EMPLOYEE_AGREEMENT" ADD FOREIGN KEY ("storeId") REFERENCES "STORE" ("storeId");

ALTER TABLE "EMPLOYEE_AGREEMENT" ADD FOREIGN KEY ("employeeAgreementTypeID") REFERENCES "EMPLOYEE_AGREEMENT_TYPE" ("employeeAgreementTypeId");

ALTER TABLE "EMPLOYEE_AGREEMENT" ADD FOREIGN KEY ("employeeId") REFERENCES "EMPLOYEE" ("employeeId");

ALTER TABLE "RESOURCE_PRICE" ADD FOREIGN KEY ("serviceTypeId") REFERENCES "SERVICETYPE" ("serviceTypeId");

ALTER TABLE "RESOURCE_PRICE" ADD FOREIGN KEY ("mainGroupId") REFERENCES "MAINGROUP" ("mainGroupId");

ALTER TABLE "RESOURCE_PRICE" ADD FOREIGN KEY ("subGroupId") REFERENCES "SUBGROUP" ("subGroupId");

ALTER TABLE "RESOURCE_PRICE_APPLY" ADD FOREIGN KEY ("employeeAgreementId") REFERENCES "EMPLOYEE_AGREEMENT" ("employeeAgreementId");

ALTER TABLE "BOOKING_PERCENT" ADD FOREIGN KEY ("employeeAgreementTypeId") REFERENCES "EMPLOYEE_AGREEMENT_TYPE" ("employeeAgreementTypeId");

ALTER TABLE "BOOKING_PERCENT" ADD FOREIGN KEY ("storeId") REFERENCES "STORE" ("storeId");

ALTER TABLE "DRIVER_RESOURCE" ADD FOREIGN KEY ("vehicleTypeId") REFERENCES "VEHICLETYPE" ("vehicleTypeId");

ALTER TABLE "DRIVER_RESOURCE" ADD FOREIGN KEY ("employeeAgreementId") REFERENCES "EMPLOYEE_AGREEMENT" ("employeeAgreementId");

ALTER TABLE "DRIVER_PRICE_DETAIL" ADD FOREIGN KEY ("vehicleTypeId") REFERENCES "VEHICLETYPE" ("vehicleTypeId");

ALTER TABLE "DRIVER_PRICE_DETAIL" ADD FOREIGN KEY ("employeeAgreementId") REFERENCES "EMPLOYEE_AGREEMENT" ("employeeAgreementId");

ALTER TABLE "DRIVER_PRICE_DETAIL" ADD FOREIGN KEY ("storeId") REFERENCES "STORE" ("storeId");

ALTER TABLE "MAX_DRIVING_TIME" ADD FOREIGN KEY ("storeId") REFERENCES "STORE" ("storeId");

ALTER TABLE "DRIVING_HOUR_INFO" ADD FOREIGN KEY ("employeeId") REFERENCES "EMPLOYEE" ("employeeId");

ALTER TABLE "DRIVING_HOUR_INFO" ADD FOREIGN KEY ("maxDrivingTimeId") REFERENCES "MAX_DRIVING_TIME" ("maxDrivingTimeId");

ALTER TABLE "EMPLOYEE_VIOLATE_INFO" ADD FOREIGN KEY ("storeId") REFERENCES "STORE" ("storeId");

ALTER TABLE "VEHICLETYPE" ADD FOREIGN KEY ("carrierTypeId") REFERENCES "CARRIERTYPE" ("carrierTypeId");

ALTER TABLE "VEHICLETYPE" ADD FOREIGN KEY ("vehicleGroupId") REFERENCES "VEHICLEGROUP" ("vehicleGroupId");

ALTER TABLE "VEHICLE" ADD FOREIGN KEY ("vehicleTypeId") REFERENCES "VEHICLETYPE" ("vehicleTypeId");

ALTER TABLE "VEHICLE" ADD FOREIGN KEY ("partnerId") REFERENCES "PARTNER" ("partnerId");

ALTER TABLE "SKILL_BY_VEHICLETYPE" ADD FOREIGN KEY ("vehicleTypeId") REFERENCES "VEHICLETYPE" ("vehicleTypeId");

ALTER TABLE "SKILL_BY_VEHICLETYPE" ADD FOREIGN KEY ("skillId") REFERENCES "SKILL" ("skillId");

ALTER TABLE "VEHICLE_BAN_SCHEDULE" ADD FOREIGN KEY ("vehicleTypeId") REFERENCES "VEHICLETYPE" ("vehicleTypeId");

ALTER TABLE "LOAD_DEVIATION" ADD FOREIGN KEY ("storeId") REFERENCES "STORE" ("storeId");

ALTER TABLE "VEHICLE_LOAD_TYPE" ADD FOREIGN KEY ("vehicleTypeID") REFERENCES "VEHICLETYPE" ("vehicleTypeId");

ALTER TABLE "VEHICLE_LOAD_TYPE" ADD FOREIGN KEY ("storeId") REFERENCES "STORE" ("storeId");

ALTER TABLE "VEHICLE_LOAD_TYPE" ADD FOREIGN KEY ("partnerId") REFERENCES "PARTNER" ("partnerId");

ALTER TABLE "VEHICLE_LOAD_IN_DAY" ADD FOREIGN KEY ("vehicleId") REFERENCES "VEHICLE" ("vehicleId");

ALTER TABLE "VEHICLE_BOOKING_RATE" ADD FOREIGN KEY ("StoreId") REFERENCES "STORE" ("storeId");

ALTER TABLE "VEHICLE_BOOKING_RATE" ADD FOREIGN KEY ("partnerId") REFERENCES "PARTNER" ("partnerId");

ALTER TABLE "VEHICLE_AGREEMENT" ADD FOREIGN KEY ("storeId") REFERENCES "STORE" ("storeId");

ALTER TABLE "VEHICLE_AGREEMENT" ADD FOREIGN KEY ("vehicleRentalAgreementTypeId") REFERENCES "VEHICLE_RENTAL_AGREEMENT_TYPE" ("vehicleRentalAgreementTypeId");

ALTER TABLE "VEHICLE_AGREEMENT" ADD FOREIGN KEY ("partnerId") REFERENCES "PARTNER" ("partnerId");

ALTER TABLE "SERVICE_PRICE" ADD FOREIGN KEY ("vehicleTypeId") REFERENCES "VEHICLETYPE" ("vehicleTypeId");

ALTER TABLE "SERVICE_PRICE" ADD FOREIGN KEY ("vehicleAgreementId") REFERENCES "VEHICLE_AGREEMENT" ("vehicleAgreementId");

ALTER TABLE "FEEONKILOMETERS" ADD FOREIGN KEY ("servicePriceId") REFERENCES "SERVICE_PRICE" ("servicePriceId");

ALTER TABLE "TRANSPORT_RESOURCE" ADD FOREIGN KEY ("vehicleTypeId") REFERENCES "VEHICLETYPE" ("vehicleTypeId");

ALTER TABLE "TRANSPORT_RESOURCE" ADD FOREIGN KEY ("vehicleAgreementId") REFERENCES "VEHICLE_AGREEMENT" ("vehicleAgreementId");

ALTER TABLE "FEE_BY_TRANSPORT_FORM" ADD FOREIGN KEY ("transportFormId") REFERENCES "TRANSPORT_FORM" ("transportFormId");

ALTER TABLE "FEE_BY_TRANSPORT_FORM" ADD FOREIGN KEY ("servicePriceId") REFERENCES "SERVICE_PRICE" ("servicePriceId");

ALTER TABLE "FEE_BY_BOOKING_DAY" ADD FOREIGN KEY ("vehicleAgreementId") REFERENCES "VEHICLE_AGREEMENT" ("vehicleAgreementId");

ALTER TABLE "FEE_BY_BOOKING_DAY" ADD FOREIGN KEY ("vehicleTypeId") REFERENCES "VEHICLETYPE" ("vehicleTypeId");

ALTER TABLE "PARTNER_REQUESTPERMONTH" ADD FOREIGN KEY ("partnerId") REFERENCES "PARTNER" ("partnerId");

ALTER TABLE "PARTNER_REQUESTPERMONTH" ADD FOREIGN KEY ("storeId") REFERENCES "STORE" ("storeId");

ALTER TABLE "AGREEMENT_VIOLATE_INFO" ADD FOREIGN KEY ("vehicleAgreementId") REFERENCES "VEHICLE_AGREEMENT" ("vehicleAgreementId");

ALTER TABLE "VEHICLE_BOOKING_EXPIRATION" ADD FOREIGN KEY ("storeId") REFERENCES "STORE" ("storeId");
