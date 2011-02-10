/*
 * Copyright (c) 2010-2011 Mark Allen.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.restfb.types;

import static com.restfb.util.DateUtils.toDateFromLongFormat;
import static com.restfb.util.DateUtils.toDateFromMonthYearFormat;
import static com.restfb.util.DateUtils.toDateFromShortFormat;
import static com.restfb.util.StringUtils.isBlank;
import static java.util.Collections.unmodifiableList;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.restfb.Facebook;
import com.restfb.util.ReflectionUtils;

/**
 * Represents the <a
 * href="http://developers.facebook.com/docs/reference/api/user">User Graph API
 * type</a>.
 * 
 * @author <a href="http://restfb.com">Mark Allen</a>
 * @since 1.5
 */
public class User extends NamedFacebookType {
  @Facebook("first_name")
  private String firstName;

  @Facebook("middle_name")
  private String middleName;

  @Facebook("last_name")
  private String lastName;

  @Facebook
  private String link;

  @Facebook
  private String bio;

  @Facebook
  private String about;

  @Facebook("relationship_status")
  private String relationshipStatus;

  @Facebook
  private String religion;

  @Facebook
  private String website;

  @Facebook
  private String birthday;

  @Facebook
  private String email;

  @Facebook
  private Double timezone;

  @Facebook
  private Boolean verified;

  @Facebook
  private String gender;

  @Facebook
  private String political;

  @Facebook
  private String locale;

  /**
   * Duplicate mapping for "hometown" since FB can return it differently in
   * different situations.
   */
  @Facebook
  private NamedFacebookType hometown;

  /**
   * Duplicate mapping for "hometown" since FB can return it differently in
   * different situations.
   */
  @Facebook("hometown")
  private String hometownAsString;

  @Facebook
  private NamedFacebookType location;

  @Facebook("significant_other")
  private NamedFacebookType significantOther;

  @Facebook("updated_time")
  private String updatedTime;

  @Facebook("interested_in")
  private List<String> interestedIn = new ArrayList<String>();

  @Facebook("meeting_for")
  private List<String> meetingFor = new ArrayList<String>();

  @Facebook
  private List<Work> work = new ArrayList<Work>();

  @Facebook
  private List<Education> education = new ArrayList<Education>();

  /**
   * Represents the <a
   * href="http://developers.facebook.com/docs/reference/api/user">Work Graph
   * API type</a>.
   * 
   * @author <a href="http://restfb.com">Mark Allen</a>
   */
  public static class Work {
    @Facebook
    private NamedFacebookType employer;

    @Facebook
    private NamedFacebookType location;

    @Facebook
    private NamedFacebookType position;

    @Facebook("start_date")
    private String startDate;

    @Facebook("end_date")
    private String endDate;

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
      return ReflectionUtils.hashCode(this);
    }

    /**
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object that) {
      return ReflectionUtils.equals(this, that);
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
      return ReflectionUtils.toString(this);
    }

    /**
     * The employer for this job.
     * 
     * @return The employer for this job.
     */
    public NamedFacebookType getEmployer() {
      return employer;
    }

    /**
     * The location of this job.
     * 
     * @return The location of this job.
     */
    public NamedFacebookType getLocation() {
      return location;
    }

    /**
     * Position held at this job.
     * 
     * @return Position held at this job.
     */
    public NamedFacebookType getPosition() {
      return position;
    }

    /**
     * Date this job was started.
     * 
     * @return Date this job was started.
     */
    public Date getStartDate() {
      return toDateFromMonthYearFormat(startDate);
    }

    /**
     * Date this job ended.
     * 
     * @return Date this job ended.
     */
    public Date getEndDate() {
      return toDateFromMonthYearFormat(endDate);
    }
  }

  /**
   * Represents the <a
   * href="http://developers.facebook.com/docs/reference/api/user">Education
   * Graph API type</a>.
   * 
   * @author <a href="http://restfb.com">Mark Allen</a>
   */
  public static class Education {
    @Facebook
    private NamedFacebookType school;

    @Facebook
    private NamedFacebookType year;

    @Facebook
    private NamedFacebookType degree;

    @Facebook
    private List<NamedFacebookType> concentration = new ArrayList<NamedFacebookType>();

    /**
     * @see Object#hashCode()
     */
    @Override
    public int hashCode() {
      return ReflectionUtils.hashCode(this);
    }

    /**
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(Object that) {
      return ReflectionUtils.equals(this, that);
    }

    /**
     * @see Object#toString()
     */
    @Override
    public String toString() {
      return ReflectionUtils.toString(this);
    }

    /**
     * The school name and ID.
     * 
     * @return The school name and ID.
     */
    public NamedFacebookType getSchool() {
      return school;
    }

    /**
     * Graduation year.
     * 
     * @return Graduation year.
     */
    public NamedFacebookType getYear() {
      return year;
    }

    /**
     * Degree acquired.
     * 
     * @return Degree acquired.
     */
    public NamedFacebookType getDegree() {
      return degree;
    }

    /**
     * Concentrations/minors.
     * 
     * @return Concentrations/minors.
     */
    public List<NamedFacebookType> getConcentration() {
      return unmodifiableList(concentration);
    }
  }

  /**
   * The user's first name.
   * 
   * @return The user's first name.
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * The user's middle name.
   * 
   * @return The user's middle name.
   */
  public String getMiddleName() {
    return middleName;
  }

  /**
   * The user's last name.
   * 
   * @return The user's last name.
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * A link to the user's profile.
   * 
   * @return A link to the user's profile.
   */
  public String getLink() {
    return link;
  }

  /**
   * The user's blurb that appears under their profile picture.
   * 
   * @return The user's blurb that appears under their profile picture.
   */
  public String getAbout() {
    return about;
  }

  /**
   * The user's relationship status.
   * 
   * @return The user's relationship status.
   */
  public String getRelationshipStatus() {
    return relationshipStatus;
  }

  /**
   * The user's birthday as a {@code String}.
   * <p>
   * Will always succeed, even if the user has specified month/year format only.
   * If you'd like to use a typed version of this accessor, call
   * {@link #getBirthdayAsDate()} instead.
   * 
   * @return The user's birthday as a {@code String}.
   */
  public String getBirthday() {
    return birthday;
  }

  /**
   * The user's birthday, typed to {@code java.util.Date} if possible.
   * 
   * @return The user's birthday, or {@code null} if unavailable or only
   *         available in month/year format.
   */
  public Date getBirthdayAsDate() {
    if (isBlank(getBirthday()) || getBirthday().split("/").length < 2)
      return null;

    return toDateFromShortFormat(birthday);
  }

  /**
   * The user's religion.
   * 
   * @return The user's religion.
   */
  public String getReligion() {
    return religion;
  }

  /**
   * A link to the user's personal website.
   * 
   * @return A link to the user's personal website.
   */
  public String getWebsite() {
    return website;
  }

  /**
   * The proxied or contact email address granted by the user.
   * 
   * @return The proxied or contact email address granted by the user.
   */
  public String getEmail() {
    return email;
  }

  /**
   * The user's timezone offset.
   * 
   * @return The user's timezone offset.
   */
  public Double getTimezone() {
    return timezone;
  }

  /**
   * Is the user verified?
   * 
   * @return User verification status.
   */
  public Boolean getVerified() {
    return verified;
  }

  /**
   * Date the user's profile was updated.
   * 
   * @return Date the user's profile was updated.
   */
  public Date getUpdatedTime() {
    return toDateFromLongFormat(updatedTime);
  }

  /**
   * The user's gender.
   * 
   * @return The user's gender.
   */
  public String getGender() {
    return gender;
  }

  /**
   * The user's biographical snippet.
   * 
   * @return The user's biographical snippet.
   */
  public String getBio() {
    return bio;
  }

  /**
   * The user's political affiliation.
   * 
   * @return The user's political affiliation.
   */
  public String getPolitical() {
    return political;
  }

  /**
   * The user's locale.
   * 
   * @return The user's locale.
   */
  public String getLocale() {
    return locale;
  }

  /**
   * The user's hometown.
   * <p>
   * Sometimes this can be {@code null} - check {@link #getHometownName()}
   * instead in that case.
   * 
   * @return The user's hometown.
   */
  public NamedFacebookType getHometown() {
    return hometown;
  }

  /**
   * The user's hometown name.
   * 
   * @return The user's hometown name.
   */
  public String getHometownName() {
    if (getHometown() != null)
      return getHometown().getName();

    return hometownAsString;
  }

  /**
   * The user's current location.
   * 
   * @return The user's current location.
   */
  public NamedFacebookType getLocation() {
    return location;
  }

  /**
   * The user's significant other.
   * 
   * @return The user's significant other.
   */
  public NamedFacebookType getSignificantOther() {
    return significantOther;
  }

  /**
   * The user's interests.
   * 
   * @return The user's interests.
   */
  public List<String> getInterestedIn() {
    return unmodifiableList(interestedIn);
  }

  /**
   * What genders the user is interested in meeting.
   * 
   * @return What genders the user is interested in meeting.
   */
  public List<String> getMeetingFor() {
    return unmodifiableList(meetingFor);
  }

  /**
   * A list of the work history from the user's profile
   * 
   * @return A list of the work history from the user's profile
   */
  public List<Work> getWork() {
    return unmodifiableList(work);
  }

  /**
   * A list of the education history from the user's profile
   * 
   * @return A list of the education history from the user's profile
   */
  public List<Education> getEducation() {
    return unmodifiableList(education);
  }
}