--
-- PostgreSQL database dump
--

\restrict ZkkPzxTNWU8ITEYXweWNpUjQsnoNfw9zawc4tgJ6eYlK7wx6jmLBAvT56FV4yIC

-- Dumped from database version 18.1
-- Dumped by pg_dump version 18.1

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET transaction_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: Task; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Task" (
    "TaskID" integer NOT NULL,
    "TaskTitle" text NOT NULL,
    "TaskDescription" text NOT NULL,
    "IsCompleted" boolean DEFAULT false NOT NULL,
    "createdAt" timestamp(3) without time zone DEFAULT CURRENT_TIMESTAMP NOT NULL,
    "UserID" integer NOT NULL
);


ALTER TABLE public."Task" OWNER TO postgres;

--
-- Name: Task_TaskID_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public."Task_TaskID_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public."Task_TaskID_seq" OWNER TO postgres;

--
-- Name: Task_TaskID_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public."Task_TaskID_seq" OWNED BY public."Task"."TaskID";


--
-- Name: User; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."User" (
    "UserID" integer NOT NULL,
    "UserName" text NOT NULL,
    "Password" text NOT NULL,
    "createdAt" timestamp(3) without time zone DEFAULT CURRENT_TIMESTAMP NOT NULL
);


ALTER TABLE public."User" OWNER TO postgres;

--
-- Name: User_UserID_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public."User_UserID_seq"
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public."User_UserID_seq" OWNER TO postgres;

--
-- Name: User_UserID_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public."User_UserID_seq" OWNED BY public."User"."UserID";


--
-- Name: Task TaskID; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Task" ALTER COLUMN "TaskID" SET DEFAULT nextval('public."Task_TaskID_seq"'::regclass);


--
-- Name: User UserID; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."User" ALTER COLUMN "UserID" SET DEFAULT nextval('public."User_UserID_seq"'::regclass);


--
-- Data for Name: Task; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."Task" ("TaskID", "TaskTitle", "TaskDescription", "IsCompleted", "createdAt", "UserID") FROM stdin;
1	Learn PostgreSQL	Practice basic SQL queries	t	2025-12-23 11:12:26.731	1
2	Build Prisma Schema	Create Prisma models manually	f	2025-12-23 11:12:26.731	1
3	Java Revision	Revise OOP concepts	t	2025-12-23 11:12:26.731	2
4	DSA Practice	Solve array and string problems	f	2025-12-23 11:12:26.731	2
5	ML Assignment	Implement Logistic Regression	f	2025-12-23 11:12:26.731	3
6	React UI	Create dashboard layout	t	2025-12-23 11:12:26.731	4
7	Database Design	Normalize database tables	f	2025-12-23 11:12:26.731	5
\.


--
-- Data for Name: User; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public."User" ("UserID", "UserName", "Password", "createdAt") FROM stdin;
1	Keval	keval@123	2025-12-23 11:11:08.383
2	Rahul	rahul@123	2025-12-23 11:11:08.383
3	Priya	priya@123	2025-12-23 11:11:08.383
4	Amit	amit@123	2025-12-23 11:11:08.383
5	Neha	neha@123	2025-12-23 11:11:08.383
\.


--
-- Name: Task_TaskID_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."Task_TaskID_seq"', 7, true);


--
-- Name: User_UserID_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."User_UserID_seq"', 5, true);


--
-- Name: Task Task_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Task"
    ADD CONSTRAINT "Task_pkey" PRIMARY KEY ("TaskID");


--
-- Name: User User_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."User"
    ADD CONSTRAINT "User_pkey" PRIMARY KEY ("UserID");


--
-- Name: Task Task_UserID_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Task"
    ADD CONSTRAINT "Task_UserID_fkey" FOREIGN KEY ("UserID") REFERENCES public."User"("UserID") ON UPDATE CASCADE ON DELETE CASCADE;


--
-- PostgreSQL database dump complete
--

\unrestrict ZkkPzxTNWU8ITEYXweWNpUjQsnoNfw9zawc4tgJ6eYlK7wx6jmLBAvT56FV4yIC

